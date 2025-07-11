import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> arr = new ArrayList<>();
        List<Integer> rankList = Arrays.stream(rank).boxed().collect(Collectors.toList());
        for(int i=0;i<rank.length;i++){
            if(attendance[i]) arr.add(rank[i]);
        }
        Collections.sort(arr);
        answer = (10000*rankList.indexOf(arr.get(0)))+(100*rankList.indexOf(arr.get(1)))+rankList.indexOf(arr.get(2));
        return answer;
    }
}