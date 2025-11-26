package practice_1.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoArea {
    public static void main(String[] args) {
//        정수 배열 arr가 주어집니다.
//        배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
//        단, arr에 2가 없는 경우 [-1]을 return 합니다.

        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 4, 5, 2, 9}))); //	[2, 1, 4, 5, 2]
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1}))); //[2]
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1}))); //[-1]
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1}))); //	[2, 1, 2, 1, 10, 2]

    }

    static int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int startIndex = -1;
        int endIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                if(startIndex == -1){
                    startIndex = i;
                }else{
                    endIndex = i;
                }
            }
        }
        if(endIndex == -1){
            if(startIndex == -1){
                return new int[]{-1};
            }else{
                return new int[]{2};
            }
        }
        for(int i = startIndex; i <= endIndex; i++){
            answer.add(arr[i]);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
