package day3;

import java.util.Scanner;

public class Duck_Number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		int rem, c=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem==0)
				c++;
			num = num / 10;
		}
		if(c>0)
			System.out.println("Number is duck number");
		else
			System.out.println("Not duck number");
		
	}

}
