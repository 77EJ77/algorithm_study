import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0; i < a.length(); i++){
            char temp = a.charAt(i);
            if(64 <= temp && temp <= 90) System.out.print((char)(temp + 32));
            else if(97 <= temp && temp <= 122) System.out.print((char)(temp - 32));
            else System.out.print(temp);
        }
    }
}