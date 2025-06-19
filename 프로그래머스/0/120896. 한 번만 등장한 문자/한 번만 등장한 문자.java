import java.util.*;
class Solution {
    public String solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        for(String str : s.split("")){
            map.put(str, map.getOrDefault(str,0)+1);
        }

        String answer = "";

        for(String str : map.keySet()){
            if(map.get(str)==1){
                answer += str;
            }
        }
        
        char[] arr = answer.toCharArray();
        Arrays.sort(arr);
        answer = String.valueOf(arr);
        return answer;
    }
}