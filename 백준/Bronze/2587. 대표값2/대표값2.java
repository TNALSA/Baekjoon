import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	Scanner sc = new Scanner(System.in);
    	
    	int sum = 0, num = 0;
    	List<Integer> list = new ArrayList<Integer>();
    	
    	
    	for(int i=0;i<5;i++) {
    		num = sc.nextInt();
    		
    		list.add(num);
    		sum += num;
    	}
    	
    	Collections.sort(list);
    	
    	System.out.println(sum / 5);
    	System.out.println(list.get((int)Math.floor(5/2)));
    } 
}

