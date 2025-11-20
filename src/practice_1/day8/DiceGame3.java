package practice_1.day8;

import java.util.HashMap;
import java.util.Map;

public class DiceGame3 {
    public static void main(String[] args) {
//        1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
//                네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
//        세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
//        주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
//                어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
//        네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
//                네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

        //a, b, c, d는 1 이상 6 이하의 정수입니다.
        System.out.println(solution(2, 2, 2, 2)); //2222
        System.out.println(solution(4, 1, 4, 4)); //1681
        System.out.println(solution(6, 3, 3, 6)); //27
        System.out.println(solution(2, 5, 2, 6)); //30
        System.out.println(solution(6, 4, 2, 5)); //2
    }
    static int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = {a, b, c, d};
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int sameCount = map.size();
        int one = 0 , two = 0, three = 0,four = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value==4) four = key;
            if(value==3) three = key;
            if(value==2) two = key;
            if(value==1) one = key;
        }
        switch (sameCount) {
            case 1: return 1111 * four;
            case 2: {
                int p = -1;
                int q = -1;
                if(three > 0) {
                    return (10 * three + one) * (10 * three + one);
                }else{
                    for (int key : map.keySet()) {
                        if (p == -1) p = key;
                        else q = key;
                    }
                    return (p + q) * (p-q >0 ? p-q : q-p);
                }
            }
            case 3:{
                int p = -1;
                int r = -1;
                for (int key : map.keySet()) {
                    if(key != two){
                        if (p == -1) p = key;
                        else r = key;
                    }
                }
                return p * r;
            }
            case 4: return Math.min(Math.min(a,b) , Math.min(c,d));
            default: return 0;
        }
    }
}
