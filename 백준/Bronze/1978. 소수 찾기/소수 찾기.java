import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		int count = 0; //소수를 count하는 변수
		
		for(int i=0;i<input;i++) {
			arr[i] = sc.nextInt();
		} //1,3,5,7
		
		for(int num:arr) { //num = 1,3,5,7
			int divisor = 0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					divisor++;
				}
			}
			if(divisor == 2) {
				count++;
			}
		}
		
		System.out.println(count);	
	}
}
