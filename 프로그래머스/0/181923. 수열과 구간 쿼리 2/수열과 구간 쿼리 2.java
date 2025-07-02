import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();
        for(int[] query : queries){
            List<Integer> nums = new ArrayList<>();
            for(int i=query[0];i<=query[1];i++){
                if(arr[i]>query[2]) nums.add(arr[i]);
            }
            answer.add(nums.size()>0?Collections.min(nums):-1);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}