import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	List<Integer> list = new ArrayList<Integer>();
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt(); // 카드의 개수
    	int m = sc.nextInt(); // 합의 최댓값
    	
    	for(int i=0;i<n;i++) {
    		list.add(sc.nextInt());
    	}
    	
    	sumOfCard(list, m);
    }
    
    public static void sumOfCard(List<Integer> list, int m) {
    	int max = 0;
    	
    	for(int i=0 ; i<list.size() ; i++) {
    		for(int j=i+1 ; j<list.size() ; j++) {
    			for(int k=j+1 ; k<list.size() ; k++) {
    				if(list.get(i)+list.get(j)+list.get(k) <= m) {
    					if(max < list.get(i)+list.get(j)+list.get(k)) {
    						max = list.get(i)+list.get(j)+list.get(k);
    					}
    				}
    			}
    		}
    	}
    	
    	System.out.println(max);
    }
    
    
}