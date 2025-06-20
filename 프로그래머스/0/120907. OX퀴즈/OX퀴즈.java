class Solution {
    public String[] solution(String[] quiz) {
        
        for(int i=0; i<quiz.length;i++){
            String[] temp = quiz[i].split(" ");
            int result = Integer.parseInt(temp[0]);
            int num2 = Integer.parseInt(temp[2]);
            
            switch(temp[1]){
                case "+":
                    result += num2;
                    break;
                case "-":
                    result -= num2;
                    break;
            }
            
            quiz[i] = result==Integer.parseInt(temp[4])?"O":"X";
        }
        
        return quiz;
    }
}