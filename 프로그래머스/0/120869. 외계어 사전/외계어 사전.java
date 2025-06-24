class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int exist = 0;
        for(String str : dic){
            exist = 0;
            for(String s : spell){
                if(str.contains(s)){
                    exist += 1;
                }
            }
            if(exist>=spell.length){
                answer++;
            }
        }
        return answer>0?1:2;
    }
}