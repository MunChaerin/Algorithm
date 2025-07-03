class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer answer = new StringBuffer(my_string);
        for(int[] query : queries){
            StringBuffer s = new StringBuffer(answer.substring(query[0],query[1]+1));
            answer.replace(query[0],query[1]+1, s.reverse().toString());
        }
        return answer.toString();
    }
}