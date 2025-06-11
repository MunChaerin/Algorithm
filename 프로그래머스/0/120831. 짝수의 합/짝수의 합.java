import java.util.*;
class Solution {
    public int solution(int n) {
        int[] arr = new int[(n/2)+1];
        for (int i = 1; i < (n/2)+1; i++){
            arr[i] = 2*i;
        }
        return Arrays.stream(arr).sum();
    }
}