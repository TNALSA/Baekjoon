import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int xMax=Integer.MIN_VALUE, xMin=Integer.MAX_VALUE;
        int yMax=Integer.MIN_VALUE, yMin=Integer.MAX_VALUE;

        int[] x = new int[num];
        int[] y = new int[num];

        for(int i=0 ; i <num; i++ ){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

            if(x[i] < xMin) xMin = x[i];
            if(x[i] > xMax) xMax = x[i];
            if(y[i] < yMin) yMin = y[i];
            if(y[i] > yMax) yMax = y[i];
        }

        System.out.println((xMax-xMin) * (yMax-yMin));
    }
}
