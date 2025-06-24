class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int exist = 0;
        for(String str : dic){
            exist = 0;
            for(String s : spell){
                if(str.contains(s)) exist ++;
            }
            if(exist==spell.length) return 1;
        }
        return 2;
    }
}