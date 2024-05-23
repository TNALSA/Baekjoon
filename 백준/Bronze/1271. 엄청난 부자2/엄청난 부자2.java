import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String m = sc.next();
    	String n = sc.next();
    	
    	BigInteger bigNumber = new BigInteger(m);
    	BigInteger bigNumber2 = new BigInteger(n);
    	
    
    	System.out.println(bigNumber.divide(bigNumber2));
    	System.out.print(bigNumber.remainder(bigNumber2));
    }
    
   
}
