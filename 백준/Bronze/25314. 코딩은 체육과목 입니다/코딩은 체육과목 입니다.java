import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = "int";
    	
    	int N;
    	do {
    		N=sc.nextInt();
    	}while(N%4!=0);
    	
    	for(int i=0;i<N/4;i++) {
    		str = "long ".concat(str);
    	}
    	
    	System.out.println(str);
    }
}