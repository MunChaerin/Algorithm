import java.util.*;
class Solution {
    public int solution(int num, int k) {
        List<Integer> nums = new ArrayList<>();
        
        for(String n : Integer.toString(num).split("")){
            nums.add(Integer.parseInt(n));
        }
        

        return nums.contains(k)?nums.indexOf(k)+1:-1;
    }
}