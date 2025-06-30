import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(int i =0; i<a.length();i++){
            char s = a.charAt(i);
            if(Character.isLowerCase(s)){
                answer += Character.toUpperCase(s);
            }else if(Character.isUpperCase(s)){
                answer += Character.toLowerCase(s);
            }
        }
        System.out.print(answer);
    }
}