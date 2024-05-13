import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gWord = 0;
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
        	if(isGroupword(sc.next())) {
        		gWord++;
        	}
        }
        
        System.out.println(gWord);
    }
    
    public static boolean isGroupword(String word) {
    	boolean[] alphabet = new boolean[26];
    	int prev = 0;
    	
    	for(int i=0;i<word.length();i++) {
    		int now = word.charAt(i);
    		if(prev != now) {
    			if(!alphabet[now-'a']) {
    				alphabet[now-'a'] = true;
    				prev = now;
    			}else
    				return false;
    		}
    	}
    	return true;
    }
}

