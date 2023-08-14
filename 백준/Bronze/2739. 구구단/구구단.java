import java.util.Scanner;

class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i < 10; i++){
            int result = num * i;
            System.out.printf("%d * %d = %d%n", num, i, result);
        }
    }
}