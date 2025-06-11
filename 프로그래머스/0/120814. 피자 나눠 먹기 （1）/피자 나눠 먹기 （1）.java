class Solution {
    public int solution(int n) {
        for(int i = 1; i<n+1; i++){
            if((i*7)>=n){
                return i;
            }
        }
        return -1;
    }
}