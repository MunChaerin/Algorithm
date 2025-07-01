class Solution {
    public int solution(int n) {
        if(n%2==1){
            return (n+1)*(n+1)/2/2;
        }else{
            return 4* n/2 * (n/2+1) * (2 * n/2 +1) / 6;
        }  
    }
}