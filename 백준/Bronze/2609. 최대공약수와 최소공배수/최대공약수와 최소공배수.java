import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int GCD = GCD(A, B);
        int LCM = LCM(A, B, GCD);

        System.out.println(GCD);
        System.out.println(LCM);
    }

    // 최대 공약수
    public static int GCD(int A, int B){
        while(B != 0){
            int temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }

    // 최소 공배수 = (A * B / 최대 공약수)
    public static int LCM(int A, int B, int GCD){
        return A * B / GCD;
    }
    }

