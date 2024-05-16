import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        int n = sc.nextInt();
        
        factorization(n);
    }
    
    public static int factorization(int n) {
		for(int i=2 ; i<=n ; i++) {
    		if(n%i==0) {
    			System.out.println(i);
    			return factorization(n/i);
    		}
    	}
		return 0;
    }
}