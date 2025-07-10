import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> answer = new Stack<>();
        
        for(int n : arr){
            if(!answer.isEmpty()&&n==answer.peek()){
                answer.pop();
            }else{
                answer.push(n);
            }
        }
        
        return answer.isEmpty()? new int[] {-1} : answer.stream().mapToInt(i->i).toArray();
    }
}