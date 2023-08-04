import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int p = a+b;
        int m = a-b;
        int g = a*b;
        int n = a/b;
        int nm = a%b;
        System.out.println(p);
        System.out.println(m);
        System.out.println(g);
        System.out.println(n);
        System.out.println(nm);
    }
}