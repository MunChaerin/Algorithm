import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int[] answer = {numbers[0]*numbers[1],numbers[numbers.length-1]*numbers[numbers.length-2]};
        Arrays.sort(answer);
        return answer[answer.length-1];
    }
}