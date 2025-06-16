class Solution {
    public int[] solution(int[] numbers, String direction) {
        switch(direction){
            case "left":
                int temp1 = numbers[0];
                for(int i = 0; i<numbers.length-1; i++){
                    numbers[i] = numbers[i+1];
                }
                numbers[numbers.length-1] = temp1;
                break;
            case "right":
                int temp2 = numbers[numbers.length-1];
                for(int i = numbers.length-1; i>0; i--){
                    numbers[i] = numbers[i-1];
                }
                numbers[0] = temp2;
                break;
        }
        return numbers;
    }
}