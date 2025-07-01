import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int x =1;
        for(int num : num_list){
            x*=num;
        }
        return Math.pow(Arrays.stream(num_list).sum(),2)>x ? 1:0;
    }
}