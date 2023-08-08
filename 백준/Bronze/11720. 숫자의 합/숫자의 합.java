import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String temp = sc.next();
        String[] list = temp.split("");
        int result = 0;
        for(int i=0; i < list.length; i++){
            result = result + Integer.parseInt(list[i]);
        }
        System.out.println(result);
    }
}