package practice_1.day6;

import java.util.Arrays;

public class TheLastTwoElements {
    public static void main(String[] args) {
//        정수 리스트 num_list가 주어질 때,
//        마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
//        마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록
//        solution 함수를 완성해주세요.
        System.out.println(Arrays.toString(solution(new int[] {2, 1, 6}))); //[2, 1, 6, 5]
        System.out.println(Arrays.toString(solution(new int[] {5, 2, 1, 7, 5}))); //[5, 2, 1, 7, 5, 10]
    }
    static public int[] solution(int[] num_list) {
        int lastElement = num_list[num_list.length - 1];
        int secondLastElement = num_list[num_list.length - 2];
        int appendElement = lastElement > secondLastElement ? lastElement - secondLastElement : 2 * lastElement;
        int[] answer = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        answer[answer.length - 1] = appendElement;
        return answer;
    }
}
