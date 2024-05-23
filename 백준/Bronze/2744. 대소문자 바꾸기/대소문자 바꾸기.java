import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String msg = sc.nextLine();
    	
    	for(int i=0;i<msg.length();i++) {
    		if((int)msg.charAt(i) == (int)msg.toUpperCase().charAt(i)) {
    			System.out.print(msg.toLowerCase().charAt(i));
    		}else if((int)msg.charAt(i) == (int)msg.toLowerCase().charAt(i)) {
    			System.out.print(msg.toUpperCase().charAt(i));
    		}
    	}  	
    }
}
