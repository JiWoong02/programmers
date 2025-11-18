package practice_1.day5;

public class ConcatenatedNumber {
    public static void main(String[] args) {
//        정수가 담긴 리스트 num_list가 주어집니다.
//        num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return
//        하도록 solution 함수를 완성해주세요.
        System.out.println(solution(new int[] {3, 4, 5, 2, 1})); //393
        System.out.println(solution(new int[] {5, 7, 8, 3})); //581
    }
    static public int solution(int[] num_list) {
        StringBuilder oddStr = new StringBuilder();
        StringBuilder evenStr = new StringBuilder();
        for(int a: num_list){
            if(a%2==0){
                evenStr.append(a);
            }else{
                oddStr.append(a);
            }
        }
        return Integer.parseInt(evenStr.toString()) + Integer.parseInt(oddStr.toString());
    }
}
