class Solution {
    public String solution(String myString) {
        String[] str = myString.split("");
        for(int i=0;i<str.length;i++){
            str[i] = str[i].equals("a") ? str[i].toUpperCase() : str[i].equals("A")?str[i] : str[i].toLowerCase();
        }
        return String.join("", str);
    }
}