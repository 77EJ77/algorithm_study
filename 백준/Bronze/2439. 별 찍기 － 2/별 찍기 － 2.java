import java.util.*;

class Main{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                if(num - i < j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}