import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int floor = 0;
        int ho = 0;

        for(int i=0;i<T;i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            if(N%H == 0){
                floor = H;
            }else {
                floor = N%H;
            }
            ho = (int) Math.ceil((double) N /H);
            System.out.printf(floor + "%02d%n",ho);
        }
        }
    }

