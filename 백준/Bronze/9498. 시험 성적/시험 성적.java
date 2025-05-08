import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        String result = "";

        if(score > 89) result = "A";
        else if(score > 79) result = "B";
        else if(score > 69) result = "C";
        else if(score > 59) result = "D";
        else result = "F";

        System.out.println(result);
    }
}