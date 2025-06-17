import java.util.stream.Stream;
import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = Stream.of(my_string.replaceAll("\\D", "").split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(answer);
        return answer;
    }
}