import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] dateList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekList = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        
        for(int i = 1; i < x; i++){
            sum += dateList[i - 1];
        }
        sum += y;
        System.out.println(weekList[sum % 7]);
        
    }
}