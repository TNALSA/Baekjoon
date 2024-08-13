import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int count=0;

        while(X >= 1){
            if(X%2 == 1){
                count++;
            }
            X/=2;
        }
        System.out.println(count);
    }
}
