import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String subject; // 과목명
        double score, total = 0, sum = 0; // 학점, 학점 총합, 학점*과목평점들의 합
        String grade; //등급
        
           
        for(int i=0;i<20;i++) {
        	subject = sc.next(); 
        	score = sc.nextDouble();
        	grade = sc.next();
        	
        	if(!grade.equals("P")) {
        		total += score; //학점
        	}
        	
        	switch(grade) {
	        	case "A+":
	        		sum += score * 4.5;
	        		break;
	        	case "A0":
	        		sum += score * 4.0;
	        		break;
	        	case "B+":
	        		sum += score * 3.5;
	        		break;
	        	case "B0":
	        		sum += score * 3.0;
	        		break;
	        	case "C+":
	        		sum += score * 2.5;
	        		break;
	        	case "C0":
	        		sum += score * 2.0;
	        		break;
	        	case "D+":
	        		sum += score * 1.5;
	        		break;
	        	case "D0":
	        		sum += score * 1.0;
	        		break;
	        	case "F":
	        		sum += score * 0.0;
	        		break;
        	}
        }       
        calculate(total, sum);
    }
    public static void calculate(double total, double sum) {
    	double majorAvg = sum/total;
    	
    	System.out.println(majorAvg);
    }
}

