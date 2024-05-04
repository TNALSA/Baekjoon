import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        
        int[] count = new int[26];
        
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i) - 'A']++;
        }
        
        int max = 0;
        char result = '?';
        
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }
        
        System.out.println(result);
    }
}

