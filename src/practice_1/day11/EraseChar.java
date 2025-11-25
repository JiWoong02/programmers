package practice_1.day11;

import java.util.Arrays;

public class EraseChar {
public static void main(String[] args) {
//    문자열 my_string과 정수 배열 indices가 주어질 때,
//    my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

    System.out.println(solution("apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3})); //programmers
}

    static String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        Arrays.sort(indices);
        int indexValue = 0;
        for(int i: indices){
            answer.deleteCharAt(i - indexValue);
            indexValue++;
        }
        return answer.toString();
    }
}
