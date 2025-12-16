package practice_1.day13;

import java.util.Arrays;

public class EveryNthElement {
    public static void main(String[] args) {
//        정수 리스트 num_list와 정수 n이 주어질 때,
//        num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록
//        solution 함수를 완성해주세요.
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 6, 1, 7, 6},2))); //[4, 6, 7]
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 6, 1, 7, 6},4))); //[4,7]

    }

    static int[] solution(int[] num_list, int n) {
        int answerLength = (num_list.length - 1) / n + 1;
        int[] answer = new int[answerLength];
        for(int i = 0; i < answerLength; i ++){
            answer[i] = num_list[i * n];
        }
        return answer;
    }
}
