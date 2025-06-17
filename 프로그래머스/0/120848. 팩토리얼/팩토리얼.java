class Solution {
    public int fact(int n1){
        if(n1==1) return 1;
        return n1 * fact(n1-1);
    }
    
    public int solution(int n) {
        int i =0;
        for(i = 1; i<n; i++){
            int fact1 = fact(i);
            int fact2 = fact(i+1);
            if(fact1 == n){
                break;
            }else if(n>fact1 && n<fact2){
                break;
            }
        }
        return i;
    }
}