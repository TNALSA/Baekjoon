import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        // 1번 방은 예외 처리
        if (n == 1) {
            System.out.println(1);
            return;
        }
        
        // 레벨을 계산
        int level = 1;
        int count = 1;
        
        while (count < n) {
            count += 6 * level;
            level++;
        }
        
        System.out.println(level);
    }
}
