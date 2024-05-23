import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
    	int[] arr = new int[10]; 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
		try {
			int A = Integer.parseInt(br.readLine());
	    	int B = Integer.parseInt(br.readLine());
			int C = Integer.parseInt(br.readLine());
			

	    	String multifly = String.valueOf(A*B*C);
	    	for(int i=0;i<multifly.length();i++) {
	    		arr[multifly.charAt(i)-48] += 1 ;
	    	}
	    	
	    	for(int i : arr) {
	    		System.out.println(i);
	    	}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	
		
    }
    
   
}
