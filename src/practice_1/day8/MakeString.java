package practice_1.day8;

import java.util.HashMap;
import java.util.Map;

public class MakeString {
    public static void main(String[] args) {
        //문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
        // my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로
        // 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
        System.out.println(solution("cvsgiorszzzmrpaqpe", new int[] {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7})); //programmers
        System.out.println(solution("zpiaz", new int[] {1, 2, 0, 0, 3})); //pizza
    }
    static String solution(String my_string, int[] index_list) {
        char[] charArr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int index: index_list) {
            sb.append(charArr[index]);
        }
        return sb.toString();
    }
}
