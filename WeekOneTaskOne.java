package xenosis;

import java.util.Scanner;

public class WeekOneTaskOne {
//Arithmetic
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st value ");
		int value1=sc.nextInt();
		System.out.println("Enter the 2nd value ");
		int value2=sc.nextInt();
		System.out.println("Enter 1 to performe the Addition");
		System.out.println("Enter 2 to performe the subtraction");
		System.out.println("Enter 3 to performe the Multipulcation");
		System.out.println("Enter 4 to performe the division");
		int value=sc.nextInt();
		
		if (value==1) {
			int result=value1+value2;
			System.out.println(value1+"+"+value2+"="+result);
		}
		else if (value==2) {
			int result=value1-value2;
			System.out.println(value1+"-"+value2+"="+result);
		}
		else if (value==3) {
			int result=value1*value2;
			System.out.println(value1+"*"+value2+"="+result);
		}
		else if (value==4) {
			int result=value1/value2;
			System.out.println(value1+"/"+value2+"="+result);
		}
		else {
			
			System.err.println("You entred the worrong value");
			System.err.println("Please try again");
			
		}
	}
}
	

