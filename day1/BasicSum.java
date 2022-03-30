package day1;

import java.util.Scanner;

public class BasicSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,d;
		System.out.println("Enter first number");
		a=sc.nextDouble();
		System.out.println("Enter second number");
		b=sc.nextDouble();
		System.out.println("Enter Third number");
		c=sc.nextDouble();
		d = a+b+c;
		System.out.println("Sum = "+d);
	}

}
