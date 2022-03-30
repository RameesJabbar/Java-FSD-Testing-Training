package day3;
//lowest of 3 numbers using ternary operator
import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int low = (num1<num2) ? (num1<num3 ? num1:num2):(num2<num3 ? num2:num3);
		System.out.println("Lowest number is "+low);
	}

}
