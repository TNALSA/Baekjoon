import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	
    	int result = atMark(A, B);
    	System.out.println(result);
    }
    
    public static int atMark(int A, int B) {
    	return (A+B)*(A-B);
    }
}
