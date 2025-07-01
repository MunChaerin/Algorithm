class Solution {
    public String solution(String code) {
        String answer = "";
        int mode= 0;
        
        for(int i=0;i<code.length();i++){
            char current = code.charAt(i);
            
            if(current=='1'){
                mode = mode==0?1:0;
                continue;
            }
            
            if(i%2==mode) answer+=(current);
        }
        
        return answer.equals("")?"EMPTY":answer;
    }
}