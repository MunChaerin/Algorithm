import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> numList = new ArrayList<>();
        
        for (int i = 2; i<=n; i++){
            if(n%i==0){
                while(n%i==0){
                    n/=i;
                }
                numList.add(i);
            }
        }
              
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}