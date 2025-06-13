import java.lang.*;
class Solution {
    public String solution(int age) {
        String answer= "" ;
        String[] ageList = Integer.toString(age).split("");
        
        for (String num : ageList ){
            answer += (char)(num.charAt(0)+49);
        }
        return answer;
    }
}