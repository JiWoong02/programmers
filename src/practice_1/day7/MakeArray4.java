package practice_1.day7;

import java.util.*;

public class MakeArray4 {
    public static void main(String[] args) {
//        정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.
//        변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
//        만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
//        stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
//        stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
//        위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.

        System.out.println(Arrays.toString(solution(new int[] {1, 4, 2, 5, 3}))); //[1, 2, 3]
    }
    static int[] solution(int[] arr) {
        Stack<Integer> result = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if(result.isEmpty()){
                result.push(arr[i]);
                i++;
            }else{
                if(result.get(result.size()-1)<arr[i]){
                    result.push(arr[i]);
                    i++;
                }else{
                    result.pop();
                }
            }
        }
        return result.stream().mapToInt(t -> t).toArray();
    }
}
