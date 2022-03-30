package day3;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit");
		int lim = scanner.nextInt();
		for(int i=1; i<lim; i++)
		{
			int count = 0;
			for(int j=1; j<lim; j++)
			{
				if(i%j == 0)
					count++;
			}
			if(count == 2)
				System.out.println(" "+i);
		}
			
		}
	}

