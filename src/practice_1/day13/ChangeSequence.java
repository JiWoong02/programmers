package practice_1.day13;

import java.util.Arrays;

public class ChangeSequence {
    public static void main(String[] args) {
//        정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n 번째 원소 이후의 원소들과
//        n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를
//        return하도록 solution 함수를 완성해주세요.

        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}, 1))); //	[1, 6, 2]
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5},3))); //	[7, 5, 5, 2, 1]

    }

    static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++){
            if(i < n){
                answer[num_list.length - n + i] = num_list[i];
            }else{
                answer[i-n] = num_list[i];
            }
        }
        return answer;
    }
}
