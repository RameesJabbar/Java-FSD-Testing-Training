package day2;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit");
		int num = scanner.nextInt();
		int i=1;
		while(i<=num)
		{
			System.out.print(i+",");
			i++;
		}
	}

}
