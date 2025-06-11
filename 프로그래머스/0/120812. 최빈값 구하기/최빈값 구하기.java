import java.util.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer,Integer> cnt = new HashMap<>();
        for (int num : array){
            cnt.put(num, cnt.getOrDefault(num,0)+1);          
        }
        
        int cntMax = 0;
        for(int num : cnt.values()){
            cntMax = Math.max(num, cntMax);
        }
        
        int answer = -1;
        int modeCnt = 0;
        for(Map.Entry<Integer,Integer> entry : cnt.entrySet()){
            if(entry.getValue() == cntMax){
                modeCnt++;
                if(modeCnt==1){
                    answer = entry.getKey();
                }
                else{
                    answer = -1;
                }
            }
        }
        
        return answer;
    }
}