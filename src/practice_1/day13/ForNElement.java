package practice_1.day13;

import java.util.Arrays;

public class ForNElement {
    public static void main(String[] args) {
//        정수 리스트 num_list와 정수 n이 주어질 때,
//        n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.

        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}, 3))); //	[6]
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5},2))); //	[2, 1, 7, 5]

    }

    static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        for (int i = n; i <= num_list.length; i++){
            answer[i-n] = num_list[i-1];
        }
        return answer;
    }
}
