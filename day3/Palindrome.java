package day3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		int demo = num;
		int rev = 0;
		while(num!=0)
		{
			rev = (rev*10) + (num%10);
			num = num / 10;
		}
		if (rev == demo)
			System.out.println(demo+" is palindrom");
		else
			System.out.println(demo+" is not palindrom");
	}

}
