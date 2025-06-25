class Solution {
    public int solution(int[][] lines) {
        int[] rail = new int[200];
        int answer = 0;
        for(int[] line : lines){
            for(int j = line[0]+100; j<line[1]+100;j++) {
                rail[j]++;
            }
        }
        
        for(int n : rail){
            if(n>1) answer++;
        }
        return answer;
    }
}