class Solution {
    public int solution(int a, int b) {
        if(a%2!=0&&b%2!=0) return (int) Math.floor(Math.pow(a*1.0,2)+Math.pow(b*1.0,2));
        else if(a%2!=0||b%2!=0) return 2*(a+b);
        else return Math.abs(a-b);
    }
}