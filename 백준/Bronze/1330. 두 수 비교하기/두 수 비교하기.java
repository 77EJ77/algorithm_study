import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] inputArr = input.split(" ");
        int a = Integer.parseInt(inputArr[0]);
        int b = Integer.parseInt(inputArr[1]);
        String result = "";

        if(a>b) result = ">";
        else if(a<b) result = "<";
        else result = "==";
        
        System.out.println(result);
    }
}