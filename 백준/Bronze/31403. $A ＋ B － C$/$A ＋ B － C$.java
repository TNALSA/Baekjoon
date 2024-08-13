import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String strAB = String.valueOf(A).concat(String.valueOf(B));
        String strC = String.valueOf(C);

        System.out.println(A+B-C);
        System.out.println(Integer.parseInt(strAB)-Integer.parseInt(strC));
        }
    }

