class Solution {
    public int solution(int n, int k) {
        int n_p = 12000 * n;
        int k_p = 2000*(k-(n/10));
        return n_p+k_p;
    }
}