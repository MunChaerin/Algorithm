import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> idx = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            if(arr[i]==2) idx.add(i);
        if(idx.size()==0) answer.add(-1);
        else if(idx.size()==1) answer.add(arr[idx.get(0)]);
        else{
            for(int i=idx.get(0);i<=idx.get(idx.size()-1);i++){
                answer.add(arr[i]);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}