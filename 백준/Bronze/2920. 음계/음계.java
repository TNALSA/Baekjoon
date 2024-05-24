import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 
    	int arr[] = new int[8];
    	
    	for(int i=0 ; i<arr.length ; i++) {
    		arr[i] = sc.nextInt();
    	}    	
    	
    	check(arr);
    }
    
    public static void check(int[] arr) {
    	boolean asc = false, desc = false;
    	for(int i=0;i<arr.length;i++) {
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[i] < arr[j]) {
    				asc = true;
    			}else if (arr[i] > arr[j]) {
    				desc = true;
    			}
    		}
    	}
    	
    	showResult(asc, desc);
    }
    
    public static void showResult(boolean asc, boolean desc) {
    	if(asc && desc) {
    		System.out.println("mixed");
    	}else if(desc) {
    		System.out.println("descending");
    	}else if(asc) {
    		System.out.println("ascending");
    	}
    }
}
