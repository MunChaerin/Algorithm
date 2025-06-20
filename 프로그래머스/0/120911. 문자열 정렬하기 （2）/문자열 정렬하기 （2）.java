import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        for(int i=0; i<arr.length;i++){
            if(Character.isUpperCase(arr[i])) arr[i]=Character.toLowerCase(arr[i]);
        }
        Arrays.sort(arr);
        String answer = String.valueOf(arr);
        return answer;
    }
}