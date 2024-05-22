import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	int w = sc.nextInt();
    	int h = sc.nextInt();
    	
    	int wx = w-x;
    	int hy = h-y;
    	
    	int min = Integer.MAX_VALUE;
    	
    	if(min > y) min = y;
    	if (min > hy) min = hy;
    	if (min > x) min = x;
    	if (min > wx) min = wx;
    	  	
    	System.out.println(min);
    }
}
