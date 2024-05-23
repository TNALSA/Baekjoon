import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int cnt =sc.nextInt();
    	
    	for(int i=0;i<cnt;i++) {
    		int count = 0;
    		int num = 0;
    		int sum = 0;
    		
    		String ox = sc.next();
    		
    		for(int j=0;j<ox.length();j++) {
    			if((int)ox.charAt(j) == (int)'O') {
    				count++;			
    				sum += count;		
    			}
    			else if((int)ox.charAt(j) == (int)'X') {
    				count = 0;
    				num = 0;
    			}
    		}
    		
    		System.out.println(sum);
    	}
    }  
}