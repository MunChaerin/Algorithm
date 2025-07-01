class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer = true;
        if(eq.equals("=")){
            answer = ineq.equals(">") ? n>=m : n<=m;
        }else{
            answer = ineq.equals(">") ? n>m : n<m;
        }
        return answer==false?0:1;
    }
}