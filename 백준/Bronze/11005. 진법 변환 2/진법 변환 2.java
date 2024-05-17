import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
    	try {
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	StringTokenizer st = new StringTokenizer(br.readLine());
	
			int n = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());	
		
			mod(n, b);
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
    }
    
    public static void mod(int n, int b) {
    	if(n < b) {
    		mod_case(n);
    		
    		return;
    	} 
    
    	int remain = n%b;
    	mod(n/b, b);
    
    	mod_case(remain);
    }
    
    public static void mod_case(int number) {
    	if(number < 10) {
    		System.out.print(number);
    	}else
    		System.out.print((char)(number+'A'-10));
    }
}