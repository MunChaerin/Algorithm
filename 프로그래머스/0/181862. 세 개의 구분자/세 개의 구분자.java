import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] str = myStr.trim().split("[abc+]");
        List<String> answer = new ArrayList<>();
        
        for(String s : str){
            if(!s.isEmpty()) answer.add(s);
        }
        
        if(answer.size()==0) answer.add("EMPTY");
    
        return answer.toArray(new String[0]);
    }
}