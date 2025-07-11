import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> delete = new ArrayList<>();
        for (int n : delete_list) {
            delete.add(n);
        }
        
        List<Integer> answer = new ArrayList<>();
        for(int n : arr){
            if(!delete.contains(n)) answer.add(n);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}