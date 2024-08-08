import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        char[] pattern = sc.next().toCharArray();

        for(int i=0;i<count-1;i++){
            char[] sentence = sc.next().toCharArray();
            for(int j=0;j<pattern.length;j++){
                if(sentence[j]!=pattern[j]){
                    pattern[j] = '?';
                }
            }
        }

        System.out.println(pattern);
    }
}
