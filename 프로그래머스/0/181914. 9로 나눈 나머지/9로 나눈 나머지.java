class Solution {
    public int solution(String number) {
        int n = 0;
        for(String s : number.split("")){
            n += Integer.parseInt(s);
        }
        return n%9;
    }
}