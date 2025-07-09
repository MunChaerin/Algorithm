import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.trim().split("x+");
        Arrays.sort(answer);
        answer = Arrays.stream(answer)
        .filter(item -> !item.equals(""))
        .toArray(String[]::new);
        return answer;
    }
}