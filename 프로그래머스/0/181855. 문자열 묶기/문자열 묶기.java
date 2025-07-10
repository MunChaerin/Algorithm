import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(String s : strArr){
            map.put(s.length(),map.getOrDefault(s.length(),0)+1);
        }
        for (HashMap.Entry<Integer, Integer> en : map.entrySet()) {
            if (en.getValue() > max) max = en.getValue();
        }
        return max;
    }
}