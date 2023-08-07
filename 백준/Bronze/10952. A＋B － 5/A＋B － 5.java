import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int temp1 = sc.nextInt();
            int temp2 = sc.nextInt();
            
            if(temp1 == 0 && temp2 == 0) break;
            System.out.println(temp1 + temp2);
        }
    }
}