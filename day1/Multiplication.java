package day1;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter 3 numbers to be multiply");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		d=(a*b*c);
		System.out.println("Product is: "+d);
	}

}
