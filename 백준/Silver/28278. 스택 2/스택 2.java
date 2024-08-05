import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> stack = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1: // push
                    int X = Integer.parseInt(st.nextToken());
                    stack.add(X);
                    break;
                case 2: // pop
                    if (stack.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(stack.remove(stack.size() - 1)).append("\n");
                    }
                    break;
                case 3: // size
                    sb.append(stack.size()).append("\n");
                    break;
                case 4: // is empty
                    sb.append(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                case 5: // top
                    if (stack.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(stack.get(stack.size() - 1)).append("\n");
                    }
                    break;
            }
        }

        System.out.print(sb.toString());
    }
}