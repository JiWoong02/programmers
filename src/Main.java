import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        정수가 담긴 리스트 num_list가 주어집니다.
//        num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
        System.out.println(solution(new int[] {3, 4, 5, 2, 1})); //1
        System.out.println(solution(new int[] {5, 7, 8, 3})); //0
    }
    static public int solution(int[] num_list) {
        int mult = 1;
        int sumSquare = 0;
        for (int i = 0; i < num_list.length; i++) {
            mult *= num_list[i];
            sumSquare += num_list[i];
        }
        sumSquare *= sumSquare;
        return mult < sumSquare ? 1 : 0;
    }
}