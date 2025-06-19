import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : array){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        if(map.keySet().contains(n)){
            answer = map.get(n);
        }else{
            answer = 0;
        }
        return answer;
    }
}