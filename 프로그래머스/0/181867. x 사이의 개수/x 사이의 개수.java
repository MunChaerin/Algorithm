import java.util.*;
class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");
        List<Integer> answer = new ArrayList<>();
        int idx=0;
        for(String s : arr){
            answer.add(s.length());
        }
        if(myString.endsWith("x")) answer.add(0);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}