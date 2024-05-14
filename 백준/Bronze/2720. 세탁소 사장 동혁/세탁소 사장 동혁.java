import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int cnt = sc.nextInt();
        
        for(int i=0 ; i<cnt ; i++) {
        	int quarter = 0, dime=0, nickel=0, penny=0;
        	int num = sc.nextInt();
        	
        	if(num>=25) {
        		quarter = num/25;
        		num%=25;
        	}
        	if(25>num && num>=10) {
        		dime = num/10;
        		num%=10;
        	}
        	if(10>num && num>=5) {
        		nickel=num/5;
        		num%=5;
        	}
        	if(5>num && num>=1) {
        		penny=num/1;
        		num%=1;
        	}	
        	
        	System.out.println(quarter+" "+dime+" "+nickel+" "+penny);
        }
        	
        
    }
}