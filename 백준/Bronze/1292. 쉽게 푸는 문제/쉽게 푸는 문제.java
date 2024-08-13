import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int num = 1;
        while(arr.size() < 1000){
            for(int i=0;i<num;i++){
                arr.add(num);
            }
            num++;
        }

        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;

        for(int i=A;i<=B;i++){
            sum += arr.get(i-1);
        }

        System.out.println(sum);
    }

}