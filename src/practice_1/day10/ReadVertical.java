package practice_1.day10;

public class ReadVertical {
    public static void main(String[] args) {
//        문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때
//        왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.

        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2)); //happy
        System.out.println(solution("programmers", 1, 1)); //programmers
    }

    static String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        for (int i = c - 1; i < my_string.length(); i+=m) {
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}
