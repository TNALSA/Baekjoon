import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	long A = sc.nextInt();
    	long B = sc.nextInt();
    	
    	long result = atMark(A, B);
    	System.out.println(result);
    }
    
    public static long atMark(long A, long B) {
    	return (A+B)*(A-B);
    }
}
