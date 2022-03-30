package day2;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int i,num;
		num = scanner.nextInt();
		i=num;
		do
		{
			System.out.print(i+",");
			i--;
		}while(i>=1);
	}

}
