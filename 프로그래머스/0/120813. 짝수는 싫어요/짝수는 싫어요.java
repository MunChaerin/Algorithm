class Solution {
    public int[] solution(int n) {
        int size = (n+1)/2;
        int[] answer = new int[size];
        for (int i=0; i<(n+1)/2; i++){ 
            answer[i] = 2*i+1;
        }
        return answer;
    }
}