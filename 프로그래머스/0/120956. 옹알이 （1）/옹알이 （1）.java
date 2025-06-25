import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> str = new ArrayList<>();
        for(String s : babbling){
            if(s.replaceAll("aya|ye|woo|ma", "").length()==0) answer++;
        }
        return answer;
    }
}