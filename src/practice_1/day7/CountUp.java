package practice_1.day7;

import java.util.ArrayList;
import java.util.Arrays;

public class CountUp {
    public static void main(String[] args) {
//        정수 start_num와 end_num가 주어질 때,
//        start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
        System.out.println(Arrays.toString(solution(3, 10))); //		[3, 4, 5, 6, 7, 8, 9, 10]
    }
    static int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        int index = 0;
        for(int i=start_num; i<=end_num; i++){
            answer[index++] = i;
        }
        return answer;
    }
}
