class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int num : array){
            String[] n = Integer.toString(num).split("");
            for(String s : n){
                if(s.equals("7")) answer++;
            }
        }
        return answer;
    }
}