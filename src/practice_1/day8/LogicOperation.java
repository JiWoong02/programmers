package practice_1.day8;

import java.util.Arrays;

public class LogicOperation {
    public static void main(String[] args) {
//        boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
//        (x1 ∨ x2) ∧ (x3 ∨ x4)
        System.out.println(solution(false, true, true, true)); //true
        System.out.println(solution(true, false, false, false)); //	false
    }
    static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
}
