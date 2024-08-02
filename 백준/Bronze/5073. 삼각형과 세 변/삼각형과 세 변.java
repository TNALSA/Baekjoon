import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, max = Integer.MIN_VALUE;
        int a, b, c;
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if(a==0 && b==0 && c==0){
                break;
            }
            else if(a+b<=c || b+c<=a || c+a<=b){
                System.out.println("Invalid");
            }
            else if(a==b && b==c && c==a){
                System.out.println("Equilateral");
            }
            else if (a==b||b==c||c==a) {
                System.out.println("Isosceles");
            }
            else if (a!=b && b!=c && c!=a) {
                System.out.println("Scalene");
            }
        }
        
    }
}
