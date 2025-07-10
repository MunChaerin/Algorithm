import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int num : arr) {
            answer.add(num);
        }
        while(!powerOfTwo(answer.size())){
            answer.add(0);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    boolean powerOfTwo(int num){
        while(num>2){
            if(num%2==1) return false;
            num/=2;
        }
        return true;
    }
}