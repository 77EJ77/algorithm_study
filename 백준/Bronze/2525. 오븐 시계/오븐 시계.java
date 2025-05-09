import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int time = sc.nextInt();

        String[] inputArr = input.split(" ");
        int a = Integer.parseInt(inputArr[0]);
        int b = Integer.parseInt(inputArr[1]);

        int sum = a*60 + b + time;
        
        System.out.println(((sum/60>23) ? (sum/60-24) : sum/60) + " " + sum%60);
    }
}