import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        for(int num:num_list){
            answer.add(num);
        }
        int size = answer.size();
        answer.add(num_list[size-1]>num_list[size-2] ? num_list[size-1]-num_list[size-2] : 2*num_list[size-1]);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}