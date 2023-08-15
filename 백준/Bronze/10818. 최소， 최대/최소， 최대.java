import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int[] list = new int[length];
        
        for(int i = 0; i < length; i++){
            list[i] = sc.nextInt();
        }
        
        Arrays.sort(list);
        System.out.printf("%d %d%n", list[0], list[length - 1]);
    }
}