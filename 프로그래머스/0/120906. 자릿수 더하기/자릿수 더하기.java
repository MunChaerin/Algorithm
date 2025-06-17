import java.lang.Integer;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] nums = Integer.toString(n).split("");
        for (String num : nums){
            answer += Integer.parseInt(num);
        }
        return answer;
    }
}