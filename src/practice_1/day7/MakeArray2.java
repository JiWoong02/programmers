package practice_1.day7;

import java.util.*;

public class MakeArray2 {
    public static void main(String[] args) {
//        정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//        만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
        //1 ≤ l ≤ r ≤ 1,000,000
        System.out.println(Arrays.toString(solution(5, 555))); //[5, 50, 55, 500, 505, 550, 555]
        System.out.println(Arrays.toString(solution(10, 20))); //[-1]
    }
    static int[] solution(int l, int r) {
        //Set으로 중복제거
        Set<Integer> candidates = new HashSet<>();
        //0 , 5 큐 생성
        Queue<String> q = new LinkedList<>();
        q.add("0");
        q.add("5");

        while (!q.isEmpty()) {
            String cur = q.poll();
            int num = Integer.parseInt(cur);

            if (num >= l && num <= r) candidates.add(num);
            //r보다 커졌다면 더이상 0, 5를 추가하지 않음
            if (num > r) break;
            
            q.add(cur + "0");
            q.add(cur + "5");
        }

        if (candidates.isEmpty()) return new int[]{-1};
        List<Integer> result = new ArrayList<>(candidates);
        Collections.sort(result);
        return result.stream().mapToInt(i -> i).toArray();
    }
}
