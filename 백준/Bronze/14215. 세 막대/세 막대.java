import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b<=c) {
            System.out.println((a+b)+(a+b-1));
        }else if(b+c<=a){
            System.out.println((b+c)+(b+c-1));
        } else if (c+a<=b) {
            System.out.println((c+a)+(c+a-1));
        }else{
            System.out.println(a+b+c);
        }
    }

}
