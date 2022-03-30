package day3;

import java.util.Scanner;

//generation of fibanacci series
public class Fibanacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit = scanner.nextInt();
		int n1=0, n2=1, sum=0;
		while(sum <= limit)
		{
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
			sum=n1+n2;
		}
		
	}

}
