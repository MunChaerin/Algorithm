import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Arrays.fill(answer,0);
        for(int i=0;i<my_string.length();i++){
            if(Character.isLowerCase(my_string.charAt(i))){
                answer[my_string.charAt(i)-65-6]++;
            }else{
                answer[my_string.charAt(i)-65]++;
            }
        }
        return answer;
    }
}