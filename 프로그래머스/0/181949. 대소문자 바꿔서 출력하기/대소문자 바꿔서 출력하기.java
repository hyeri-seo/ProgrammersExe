import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newStr = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)>=97) newStr += str.substring(i, i+1).toUpperCase();
            else newStr += str.substring(i, i+1).toLowerCase();
        }
        System.out.println(newStr);
    }
}