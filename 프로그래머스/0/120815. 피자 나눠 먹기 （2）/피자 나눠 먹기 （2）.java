class Solution {
    public int gcd(int n, int m){
        if(m==0) return n;
        return gcd(m, n%m);
    }
    public int lcm(int n, int m){
        return (n*m)/gcd(n,m);
    }
    
    public int solution(int n) {
        return lcm(n,6)/6;
    }
}