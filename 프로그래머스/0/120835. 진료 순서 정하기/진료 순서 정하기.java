import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int size = emergency.length;
        int[] answer = emergency.clone();
        Map<Integer, Integer> rankMap = new HashMap<>();
        
        Arrays.sort(emergency);
        for (int i=0;i<size;i++){
            rankMap.put(emergency[i], size-i);
        }
       
        for (int i = 0; i<size; i++){
            answer[i] = rankMap.get(answer[i]);
        }
        
        return answer;
    }
}