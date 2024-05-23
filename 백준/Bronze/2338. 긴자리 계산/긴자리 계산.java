import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String a = sc.next();
    	String b = sc.next();
    	
    	BigInteger bigNumber = new BigInteger(a);
    	BigInteger bigNumber2 = new BigInteger(b);
    	
    
    	System.out.println(bigNumber.add(bigNumber2));
    	System.out.println(bigNumber.subtract(bigNumber2));
    	System.out.println(bigNumber.multiply(bigNumber2));
    }
}
