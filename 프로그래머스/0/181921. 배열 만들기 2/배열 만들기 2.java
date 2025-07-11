import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        for(int i=l;i<=r;i++){
            if(Integer.toString(i).replaceAll("[05]","").length()==0) answer.add(i);
        }
        if(answer.size()==0) answer.add(-1);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}