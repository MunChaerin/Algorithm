class Solution {
    public int solution(String A, String B) {
        String temp = B.repeat(3);
        return temp.indexOf(A);
    }
}