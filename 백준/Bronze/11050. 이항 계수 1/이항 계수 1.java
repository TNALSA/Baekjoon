import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int K = sc.nextInt();

       int result = factorial(N) / (factorial(N-K) * factorial(K));
       System.out.println(result);

    }

    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
