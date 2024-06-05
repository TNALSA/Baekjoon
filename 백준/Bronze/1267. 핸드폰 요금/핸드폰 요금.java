import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int Ycharge = 0;
    	int Mcharge = 0;
    	
    	int N = sc.nextInt();
    	
    	for(int i=0 ; i<N ; i++) {
    		int time = sc.nextInt();
    		
    		Ycharge += 10*((time/30)+1);
    		Mcharge += 15*((time/60)+1);
    	}
    	
    	printResult(Ycharge, Mcharge);
    }
    
    public static void printResult(int Ycharge, int Mcharge) {
    	if(Ycharge < Mcharge) {
			System.out.println("Y "+Ycharge);
		}else if(Ycharge == Mcharge) {
			System.out.println("Y M "+Ycharge);
		}else
			System.out.println("M "+Mcharge);
    }  
}