class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for (String s : keyinput){
            if (s.equals("right")){
                answer[0]++;
            }else if(s.equals("left")){
                answer[0]--;
            }else if(s.equals("up")){
                answer[1]++;
            }else {
                answer[1]--;
            }
            
            if(Math.abs(answer[0])>board[0]/2){
            answer[0] = answer[0]<0?(board[0]/2)*(-1):board[0]/2;
            }
            if(Math.abs(answer[1])>board[1]/2){
                answer[1] = answer[1]<0?(board[1]/2)*(-1):board[1]/2;
            }
        }
        
        
        return answer;
    }
}