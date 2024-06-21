import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        
        int x = (f*b-e*c)/(d*b-a*e);
        int y = (a*f-d*c)/(a*e-d*b);
        
        System.out.println(x+" "+y);
     }
}

