import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int init = number;
        int count = 0;

        cycle(count, init, number);
    }

    public static void cycle(int count, int init , int number){
        int result = number/10 + number%10;
        int next = (number%10)*10 + result%10;
        count++;
        if(next == init){
            System.out.println(count);
        }else{
            cycle(count,init, next);
        }
    }
}
