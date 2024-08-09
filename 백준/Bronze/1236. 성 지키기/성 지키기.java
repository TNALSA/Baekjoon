import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Xcount = 0;
        int N=sc.nextInt();
        int M=sc.nextInt();
        char[][] castle = new char[N][M];

        // 성 입력 받기
        for(int i=0;i<N;i++){
            String text = sc.next();
            castle[i] = text.toCharArray();
        }

        // 경비원 없는 행의 수
        int notN=0; // 경비원 없는 행 수를 카운트
        int knight=0; // 행에 존재하는 기사들 카운트

        for(int i=0;i<N;i++){
            for(int j =0;j<M;j++){
                if(castle[i][j] == 'X'){
                    knight++;
                }
            }if(knight == 0){
                notN++;
            }
            knight = 0;
        }

        // 경비원 없는 열의 수
        int notM=0;
        for(int j=0;j<M;j++){
            for(int i=0;i<N;i++){
                if(castle[i][j] == 'X'){
                    knight++;
                }
            }if(knight == 0){
                notM++;
            }knight = 0;
        }

        System.out.println(Math.max(notN,notM));
    }

}
