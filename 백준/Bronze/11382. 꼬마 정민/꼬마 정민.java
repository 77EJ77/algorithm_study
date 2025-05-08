import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        
        System.out.println(Long.parseLong(inputArr[0]) + Long.parseLong(inputArr[1]) + Long.parseLong(inputArr[2]));
    }
}