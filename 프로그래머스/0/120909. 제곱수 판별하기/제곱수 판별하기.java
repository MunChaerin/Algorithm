import java.lang.Math;
class Solution {
    public int solution(int n) {
        return isInteger(Math.sqrt(n));
    }
    
    public int isInteger(double n){
        return n%1==0.0?1:2;
    }
}