package practice_1.day9;

import java.util.Arrays;

public class SuffixArray {
    public static void main(String[] args) {
//        어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
//        예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
//        문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.


        System.out.println(Arrays.toString(solution("banana"))); //["a", "ana", "anana", "banana", "na", "nana"]
        System.out.println(Arrays.toString(solution("programmers"))); //["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]
    }
    static public String[] solution(String my_string) {
        int string_length = my_string.length();
        String[] answer = new String[string_length];
        for (int i = 0; i < string_length; i++) {
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
