import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        move(N);
        
    }
    
    public static void move(int N) {
    	int corner = 4, dot = 5;
    	
        for(int i=1;i<=N;i++) {
        	if(i==1) {
        		corner += dot;
        	}else {
        		dot = (dot*4)- (int)Math.pow(2, i);
        		corner += dot;
        	}
        }
        
        System.out.println(corner);
    }
}
