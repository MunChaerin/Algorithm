class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        if(m==1){
            answer = my_string;
        }else{
            for(int i=c-1;i<my_string.length();i+=m){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}