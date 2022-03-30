package day2;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age,weight;
		System.out.println("Enter the age");
		age = scanner.nextInt();
		System.out.println("Enter the weight");
		weight = scanner.nextInt();
		if (age > 18)
		{
			if (weight >50)
			{
				System.out.println("Eligible for blood donation");
			}
			else
			{
				System.out.println("You are not eligible to donate blood");
			}
		}
		else
		{
			System.out.println("Age must greater than 18");
		}
	}

}
