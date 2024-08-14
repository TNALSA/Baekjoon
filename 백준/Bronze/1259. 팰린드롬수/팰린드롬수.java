import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String S = sc.next();

            if(S.equals("0")){
                break;
            }

            boolean felin = true;

            for(int i = 0, j = S.length()-1; i < S.length(); i++, j--){
                if(!(S.charAt(i)==S.charAt(j))){
                    felin = false;
                }
            }
            if(felin){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        }
    }

