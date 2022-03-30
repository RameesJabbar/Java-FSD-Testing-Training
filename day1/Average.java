package day1;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,d;
		System.out.println("Enter 3 numbers:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=(a+b+c)/3;
		System.out.println("Average is: "+d);

	}

}
