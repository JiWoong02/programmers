package practice_1.day12;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TheFirstNegativeNumber {
public static void main(String[] args) {
//    정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의
//    인덱스를 return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return합니다.

    System.out.println(solution(new int[] {12, 4, 15, 46, 38, -2, 15})); //5
    System.out.println(solution(new int[] {13, 22, 53, 24, 15, 6})); //	-1

}

    static int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}
