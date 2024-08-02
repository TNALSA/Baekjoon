import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] copy = new int[num];

        for(int i=0;i<num;i++) {
            arr[i] = sc.nextInt();
        }

        System.arraycopy(arr,0,copy,0,arr.length);

        print(arr, copy);
    }
    public static void print(int[] arr, int[] copy){
        Arrays.sort(copy);
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<copy.length;j++){
               if(arr[i]==copy[j]){
                   System.out.print(j+" ");
                   copy[j] = -1;
                   break;
               }
           }
       }
    }
}
