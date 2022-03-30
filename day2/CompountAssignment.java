package day2;

import java.util.Scanner;

public class CompountAssignment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c,d,e,f,g;
		System.out.println("Enter two numbers");
		a=scanner.nextInt();
		b=scanner.nextInt();
		a+=b;
		System.out.println("Addition is"+a);
		a-=b;
		System.out.println("subtration is"+a);
		a*=b;
		System.out.println("multiplication is"+a);
		a/=b;
		System.out.println("Division is"+a);
		
		
	}

}
