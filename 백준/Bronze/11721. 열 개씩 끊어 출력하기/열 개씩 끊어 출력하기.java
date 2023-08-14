import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int cnt = input.length();
        for(int i = 0; i < cnt; i++) {
            System.out.print(input.charAt(i));
            if(i % 10 == 9) System.out.println();
        }
    }
}