import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for(String str : intStrs){
            int n = Integer.parseInt(str.substring(s,s+l));
            if(n>k) answer.add(n);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}