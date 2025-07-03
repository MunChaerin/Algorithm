import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> arr = new ArrayList<>();
        for(int i=0;i<my_string.length();i++){
            arr.add(my_string.substring(i,my_string.length()));
        }
        String[] answer = arr.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}