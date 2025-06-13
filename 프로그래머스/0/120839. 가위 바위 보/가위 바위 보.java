import java.util.*;
class Solution {
    public String solution(String rsp) {
        Map<String, String> map = new HashMap<>();
        map.put("2","0");
        map.put("0","5");
        map.put("5","2");
        
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i<rsp.length();i++){
            answer.append(map.get(rsp.substring(i,i+1)));
        }
        return answer.toString();
    }
}