import java.util.Scanner;

import java.lang.Math;

public class UC4 {

	static UC4_subClass obj = new UC4_subClass();

	static final double lengthl1 = obj.length1();
	static final double lengthl2 = obj.length2();

	public static void main(String[] args) {
		System.out.println("The length of the line l1 is " + lengthl1);
		System.out.println("The length of the line l2 is " + lengthl2);
		UC4_subClass.compareTo();
	}
}

class UC4_subClass extends UC4 {
	static void  compareTo(){                                   
		if (lengthl1 == lengthl2)
		{
			System.out.println("The two lines are equal");
		}
		else if(lengthl1 >= lengthl2)
		{
			System.out.println("The first line is greater than second line");
		}
		else
		{

			{
				System.out.println("The first line is greater than second line");
			}
		}
	}
	
	static double length1() {                                               
		System.out.println("Enter Details of first line ");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x1 point of First line");
		int x1 = scanner.nextInt();
		System.out.println("Enter y1 point of First line");
		int x2 = scanner.nextInt();
		System.out.println("Enter x2 point of First line");
		int y1 = scanner.nextInt();
		System.out.println("Enter y2 point of First line");
		int y2 = scanner.nextInt();
		double length1 = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		return length1;
	}

	static double length2(){                                            
		System.out.println("Enter Details of second line ");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x1 point of Second line");
		int x1 = scanner.nextInt();
		System.out.println("Enter y1 point of Second line");
		int x2 = scanner.nextInt();
		System.out.println("Enter x2 point of Second line");
		int y1 = scanner.nextInt();
		System.out.println("Enter y2 point of Second line");
		int y2 = scanner.nextInt();

		double length2 = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		return length2;
	}
} 
