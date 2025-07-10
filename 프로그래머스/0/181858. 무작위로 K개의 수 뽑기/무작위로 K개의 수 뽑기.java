import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();
        for(int n : arr){
            if(answer.size()>=k) break;
            if(!answer.contains(n)){
                answer.add(n);
            }
        }
        while(answer.size()!=k){
            answer.add(-1);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}