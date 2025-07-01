class Solution {
    public int solution(int a, int b, int c) {
        int answer = a+b+c;
        if(a==b||b==c||a==c){
            answer *= (a*a+b*b+c*c);
        }
        if(a==b && a==c){
            answer *= 3*Math.pow(a,3);
        }
        return answer;
    }
}