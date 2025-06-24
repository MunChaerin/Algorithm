class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int size = board.length;
        int[][] np = new int[size+2][size+2];
        
        for(int i = 0; i<size;i++){
            for(int j =0;j<size;j++){
                if(board[i][j]==1) {
                    np[i+1][j+1]=1;
                    np[i+2][j+2]=1;
                    np[i+1][j+2]=1;
                    np[i+2][j+1]=1;
                    np[i][j]=1;
                    np[i][j+1]=1;
                    np[i][j+2]=1;
                    np[i+1][j]=1;
                    np[i+2][j]=1;
                }
            }
        }
        for(int i = 1; i<np.length-1;i++){
                for(int j =1;j<np.length-1;j++){
                    if(np[i][j]==0) answer++;
                }
            }
        return answer;
    }
}