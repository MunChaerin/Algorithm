class Solution {
    public int solution(int[] sides) {
        int max = sides[0] ;
        int min = 0;
        for(int side : sides){
            if(max<side){
                max = side;
            }else{
                min += side;
            }
        }
        return max<min?1:2;
    }
}