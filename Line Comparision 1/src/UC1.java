import java.util.Scanner;
import java.lang.Math;
public class UC1 {
	    static double length(){
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter x1 line point");
	        int x1 = scanner.nextInt();
	        System.out.println("Enter y1 line point");
	        int x2 = scanner.nextInt();
	        System.out.println("Enter x2 line point");
	        int y1 = scanner.nextInt();
	        System.out.println("Enter y2 line point");
	        int y2 = scanner.nextInt();

	        double length = Math.sqrt(Math.pow((x2-x1),2)-Math.pow((y2-y1),2));
	        return length;
	    }
	    
	    public static void main(String[] args){
	        System.out.println("The length of the line is "+length());
    }
}
