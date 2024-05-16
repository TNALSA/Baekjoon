import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int min = Integer.MAX_VALUE; //Integer 자료형이 표현할 수 있는 최댓값
	static int sum = 0;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
     
        int m = sc.nextInt();
        int n = sc.nextInt();
              
        for(int i=m ; i<=n ; i++) {
        	isDecimal(i);
        }
        
        if(sum == 0) //sum = 0이라는 것은 소수가 없다는 것을 의미한다.
        	System.out.println("-1");
        else {
        	System.out.println(sum);
        	System.out.println(min);
        }
    }
    
    public static void isDecimal(int num) {	
    	if(num < 2) return;
    	
    	for(int i=2 ; i<num ; i++) {
    		if(num % i == 0) {
    			return;
    		}
    	}
    
    	if(num < min) min = num;
    	sum += num; 
    	
    }
}