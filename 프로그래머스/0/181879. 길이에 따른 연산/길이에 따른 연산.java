import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length>10){
            answer = Arrays.stream(num_list).sum();
        }else{
            answer = 1;
            for(int num : num_list) answer *= num;
        }
        return answer;
    }
}