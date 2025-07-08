import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr1 = new int[arr.length];
        while(true){
            arr1 = arr.clone();
            for(int i=0;i<arr.length;i++){
                arr[i] = arr[i]>=50 && arr[i]%2==0 ? arr[i]/2 : arr[i]<50 && arr[i]%2==1 ? (arr[i]*2)+1 : arr[i];
            }
            if(Arrays.equals(arr,arr1)) break;
            else answer++;
        }
        return answer;
    }
}