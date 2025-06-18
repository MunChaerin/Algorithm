import java.util.LinkedHashSet;
class Solution {
    public String solution(String my_string) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        String[] str = my_string.split("");
        
        for(String s : str){
            set.add(s); 
        }
        
        String answer = String.join("",set);
        
        return answer;
    }
}