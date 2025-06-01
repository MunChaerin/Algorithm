class Solution {
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a% b);
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {(numer1*denom2)+(numer2*denom1),denom1*denom2};
        int num = gcd(answer[0],answer[1]);
        answer[0] /= num;
        answer[1] /= num;
        
        return answer;
    }
}