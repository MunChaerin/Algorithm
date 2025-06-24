import java.util.regex.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        Matcher matcher = Pattern.compile("\\d+").matcher(my_string);
        while(matcher.find()){
            answer += Integer.parseInt(matcher.group());
        }
        return answer;
    }
}