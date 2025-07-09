class Solution {
    public int solution(String myString, String pat) {
        String[] arr = myString.split("");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("A")) arr[i] = "B";
            else if(arr[i].equals("B")) arr[i] = "A";
        }
        return String.join("",arr).contains(pat)?1:0;
    }
}