import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int time = 0, eTime = 0, temp;
    	
    	int N = sc.nextInt();
    	int m = sc.nextInt();
    	int M = sc.nextInt();
    	int T = sc.nextInt();
    	int R = sc.nextInt();
    	
    	int initM = m;
    	
    	while(eTime < N) {
    		if(initM + T > M) {
    			time = -1;
    			break;
    		}
    		else if(m + T <= M) {
    			m += T;
    			eTime++;
    			time++;
    		}else {
    			if(m-R < initM) m = initM;
    			else m-=R;
    			time++;
    		}
    	}	
    	System.out.println(time);   	
    }
}
