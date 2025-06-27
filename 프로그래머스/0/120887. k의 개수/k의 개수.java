class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = Integer.toString(k);
        for(int n = i; n<=j;n++){
            for(String s : Integer.toString(n).split("")){
                answer += s.contains(str)?1:0;
            }
        }
        return answer;
    }
}