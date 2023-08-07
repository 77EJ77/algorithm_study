import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        
        for(int i = 0; i < cnt; i++){
            int temp1 = sc.nextInt();
            int temp2 = sc.nextInt();
            System.out.println(temp1 + temp2);
        }
    }
}