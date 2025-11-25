package practice_1.day11;

import java.util.Arrays;

public class CountDown {
public static void main(String[] args) {
//    정수 start_num와 end_num가 주어질 때,
//    start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

    System.out.println(Arrays.toString(solution(10, 3))); //	[10, 9, 8, 7, 6, 5, 4, 3]
}

    static int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        for (int i = start_num; i >= end_num; i--) {
            answer[start_num - i] = i ;
        }
        return answer;
    }
}
