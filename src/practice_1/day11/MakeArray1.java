package practice_1.day11;

import java.util.Arrays;

public class MakeArray1 {
public static void main(String[] args) {
//    정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

    System.out.println(Arrays.toString(solution(10, 3))); // [3, 6, 9]
    System.out.println(Arrays.toString(solution(15, 5))); // [5, 10, 15]
}

    static int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int index=0;
        for(int i = k; i <= n; i+=k){
            answer[index++] = i;
        }
        return answer;
    }
}
