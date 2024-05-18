import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            climb(a, b, v);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void climb(int a, int b, int v) {
        // 마지막 날에는 밤에 미끄러지지 않으므로, 정상에 도달하기 전날의 높이는 v-a이다.
        // 총 소요 일수는 (v-a)를 (a-b)로 나눈 값에 1을 더한 것이다. 
        // 이 때, 나누어 떨어지지 않는 경우(소수점이 있는 경우) 추가로 하루가 더 필요하므로, 올림 처리를 해준다.
        int day = (v - b - 1) / (a - b) + 1;

        System.out.println(day);
    }
}
