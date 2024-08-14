import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int sum = 0;
        char[] s;

        String S =sc.next();
        s = S.toCharArray();

        for(int i=0;i<s.length;i++){
            sum += (s[i]-96) * (int) Math.pow(31, i);
        }
        System.out.println(sum);
        }
    }

