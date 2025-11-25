package practice_1.day11;

import java.util.Arrays;

public class CountChar {
public static void main(String[] args) {
//    알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때,
//    my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수,
//    my_string에서 'a'의 개수, my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를
//    순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.


    System.out.println(Arrays.toString(solution("Programmers"))); //	[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
}

    static int[] solution(String my_string) {
        char[] my_chars = my_string.toCharArray();
        int[] answer = new int[52];
        for(char ch : my_chars){
            if(ch >= 'a' && ch <= 'z'){
                answer[ch - 'A' - 5]++;
            }else{
                answer[ch - 'A']++;
            }
        }
        return answer;
    }
}
