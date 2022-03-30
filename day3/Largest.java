package day3;
//Biggest of s numbers using ternary operators 
import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int big = (num1>num2) ? (num1>num3 ? num1:num2):(num2>num3 ? num2:num3);
		System.out.println("Biggest number is "+big);
	}
}
