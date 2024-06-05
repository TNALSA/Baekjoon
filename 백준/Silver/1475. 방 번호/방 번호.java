import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] count = new int[10];
        String N = br.readLine();
        
        for(int i = 0; i < N.length(); i++) {
            count[N.charAt(i) - '0']++;
        }
        
        // 6과 9의 처리
        int sixAndNine = (count[6] + count[9] + 1) / 2; // 6과 9의 사용 횟수를 합친 후 2로 나누고 올림 처리
        count[6] = sixAndNine;
        count[9] = sixAndNine;
        
        int max = 0;
        for(int i = 0; i < 10; i++) {
            if(count[i] > max) {
                max = count[i];
            }
        }
        
        System.out.println(max);
    }
}
