package xenosis;

import java.util.Scanner;

public class WeekOneTaskTwo {
//Odd or Even
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number");
		int a= sc.nextInt();
		if(a%2==0) {
			System.out.println("The ented number "+a+" is even number");
		}
		else {
			System.out.println("The ented number "+a+" is odd number");
		}
	}

}
