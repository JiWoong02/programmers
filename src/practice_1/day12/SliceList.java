package practice_1.day12;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SliceList {
public static void main(String[] args) {
//    정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다.
//    slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
//            n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
//            n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
//            n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
//            n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
//    올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.

    System.out.println(Arrays.toString(solution(1, new int[] {1,5,2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}))); //[2, 3, 4, 5, 6]
    System.out.println(Arrays.toString(solution(2, new int[] {1,5,2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}))); //[2, 3, 4, 5, 6]
    System.out.println(Arrays.toString(solution(3, new int[] {1,5,2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}))); //[2, 3, 4, 5, 6]
    System.out.println(Arrays.toString(solution(4, new int[] {1,5,2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}))); // 	[2, 4, 6]
}

    static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        switch(n) {
            case 1:
                answer = Arrays.stream(num_list, 0, slicer[1] + 1).toArray();
                break;
            case 2:
                answer = Arrays.stream(num_list, slicer[0], num_list.length).toArray();
                break;
            case 3:
                answer = Arrays.stream(num_list, slicer[0], slicer[1] + 1).toArray();
                break;
            case 4:
                answer = IntStream.iterate(slicer[0], i -> i <= slicer[1], i -> i + slicer[2])
                        .map(i -> num_list[i])
                        .toArray();
                break;
            default: throw new IllegalArgumentException();
        }
        return answer;
    }
}
