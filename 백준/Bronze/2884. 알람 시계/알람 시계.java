import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = (x * 60) + y;
        if(sum >= 45) sum = sum - 45;
        else sum = (23*60 + 60) + (sum-45);

        System.out.println((sum/60) + " " + (sum%60));
    }
}