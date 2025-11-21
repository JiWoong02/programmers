package practice_1.day10;

public class ReverseString {
    public static void main(String[] args) {
//    문자열 my_string과 정수 s, e가 매개변수로 주어질 때,
//    my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.

        System.out.println(solution("Progra21Sremm3", 6, 12)); //ProgrammerS123
        System.out.println(solution("Stanley1yelnatS", 4, 10)); //Stanley1yelnatS
    }

    static String solution(String my_string, int s, int e) {
        char[] arr = my_string.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i >= s && i <= e) {
                answer.append(arr[e - (i - s)]);
            } else {
                answer.append(arr[i]);
            }
        }
        return answer.toString();
    }
}
