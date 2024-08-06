import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int count = 0;
            String sentence = sc.nextLine();
            if(sentence.equals("#")){
                break;
            }
            for(int i=0;i<sentence.length();i++){
                if(sentence.charAt(i)=='a' ||
                    sentence.charAt(i)=='e'||
                    sentence.charAt(i)=='i'||
                    sentence.charAt(i)=='o'||
                    sentence.charAt(i)=='u'){count+=1;}
                else if (sentence.charAt(i)=='A' ||
                        sentence.charAt(i)=='E'||
                        sentence.charAt(i)=='I'||
                        sentence.charAt(i)=='O'||
                        sentence.charAt(i)=='U') {count+=1;}
            }
            System.out.println(count);
        }
    }
}
