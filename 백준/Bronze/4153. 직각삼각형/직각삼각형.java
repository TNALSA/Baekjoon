import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        while(true){
           a = sc.nextInt();
           a = (int) Math.pow(a,2);

           b = sc.nextInt();
           b = (int)Math.pow(b,2);

           c = sc.nextInt();
           c = (int)Math.pow(c,2);

           if(a==0&&b==0&&c==0){
               break;
           }
           else if((a+b==c)||(b+c==a)||(c+a==b)){
               System.out.println("right");
           }else {
               System.out.println("wrong");
           }
        }
       }
    }

