import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        
        int temp1, temp2;
        
        for(int i = 0; i < cnt; i++){
            temp1 = sc.nextInt();
            temp2 = sc.nextInt();
            int result = temp1 + temp2;
            System.out.printf("Case #%d: %d%n", i+1, result);
        }
    }
}