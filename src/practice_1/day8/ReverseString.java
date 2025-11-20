package practice_1.day8;

public class ReverseString {
    public static void main(String[] args) {
//        문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. queries의 원소는 [s, e] 형태로,
//        my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
//        my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
        System.out.println(solution("rermgorpsam", new int[][] {{2, 3}, {0, 7}, {5, 9}, {6, 10}})); //programmers
    }
    static String solution(String my_string, int[][] queries) {
        char[] charArr = my_string.toCharArray();
        for(int[] query: queries) {
            char[] temp = new char[query[1] - query[0] + 1];
            for(int i = 0; i < temp.length; i++) {
                temp[i] = charArr[query[1] - i];
            }
            System.arraycopy(temp, 0, charArr, query[0], temp.length);
        }
        return String.valueOf(charArr);
    }
}
