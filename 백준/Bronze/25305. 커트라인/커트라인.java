import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int cnt = sc.nextInt();
    	int N = sc.nextInt();
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for(int i=0;i<cnt;i++) {
    		list.add(sc.nextInt());
    	}
    	
    	list.sort(Comparator.reverseOrder());
    	
    	System.out.println(list.get(N-1));
    	
    }
}
