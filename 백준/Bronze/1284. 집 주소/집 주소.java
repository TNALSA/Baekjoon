import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int area = 1;
            String number = sc.nextLine();
            if(number.equals("0")){
                return;
            }

            for(int i=0;i<number.length();i++){
                if(number.charAt(i) == '1'){
                    area += 2;
                } else if (number.charAt(i) == '0') {
                    area += 4;
                } else {
                    area += 3;
                }
                area += 1;
            }
            System.out.println(area);
        }
    }
}
