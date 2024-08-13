import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] size = new int[6];
        // 참가자 수 입력받기
        int N = sc.nextInt();

        // 사이즈 별 신청자 수 입력
        for(int i=0;i<size.length;i++){
            size[i] = sc.nextInt();
        }

        // 티셔츠와 펜 수 입력 받기
        int T = sc.nextInt();
        int P = sc.nextInt();

        // 티셔츠 묶음 수, 펜 묶음 수, 낱개 펜의 수
        int Tbundle=0;
        int Pbundle=0;
        int Pcount=0;

        for(int i=0;i<size.length;i++){
            int mok = (size[i]/T);
            int nam = 0;
            if(size[i]%T > 0){
                nam+=1;
            }
            Tbundle += mok + nam;
            Pbundle = N/P;
            Pcount = N%P;
        }
        System.out.println(Tbundle);
        System.out.println(Pbundle+" "+Pcount);

       }
    }

