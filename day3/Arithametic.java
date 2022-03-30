package day3;

import java.util.Scanner;

//program to perform basic arithmetic operation
public class Arithametic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		double num1 = scanner.nextDouble();
		System.out.println("Enter Second Number");
		double num2 = scanner.nextDouble();
		double sum = num1 + num2;
		double sub = num1 - num2;
		double mul = num1 * num2;
		double div = num1 / num2;
		double rem = num1 % num2;
		System.out.println("Sum is "+sum);
		System.out.println("Difference is "+sub);
		System.out.println("Product is "+mul);
		System.out.println("Quotient is "+div);
		System.out.println("Reminder is "+rem);
		
	}

}
