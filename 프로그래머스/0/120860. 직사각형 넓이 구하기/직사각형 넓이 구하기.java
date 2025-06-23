import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for(int i = 0; i<4; i++){
            x.add(dots[i][0]);
            y.add(dots[i][1]);
        }

        return (Collections.max(x)-Collections.min(x))*(Collections.max(y)-Collections.min(y));
    }
}