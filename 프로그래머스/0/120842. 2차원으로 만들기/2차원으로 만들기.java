import java.util.*;
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int start_index =0;
        for(int i = 0; i<num_list.length/n;i++){
            answer[i] = Arrays.copyOfRange(num_list,start_index,start_index+n);
            start_index+=n;
        }
        return answer;
    }
}