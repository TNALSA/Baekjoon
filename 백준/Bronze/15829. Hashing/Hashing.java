import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        long mod = 1234567891;
        long hashValue = 0;

        String input = sc.next();

        for(int i = 0; i < L; i++){
            // 알파벳에 대한 매핑 (a: 1, b: 2, c: 3, ...)
            int charValue = input.charAt(i) - 'a' + 1;

            // 31^i % mod 계산
            long power = 1;
            for(int j = 0; j < i; j++){
                power = (power * 31) % mod;
            }
            hashValue = (hashValue + charValue * power) % mod;
        }
        System.out.println(hashValue);
        }
    }

