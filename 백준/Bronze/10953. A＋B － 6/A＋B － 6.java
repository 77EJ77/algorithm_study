import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        
        for(int i = 0; i < cnt; i++){
            String temp = sc.next();
            String[] tempList = temp.split(",");
            int result = Integer.parseInt(tempList[0]) + Integer.parseInt(tempList[1]);
            System.out.println(result);
        }
    }
}