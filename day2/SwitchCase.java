package day2;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Monday, 2.Tuesday, 3.Wednessday, 4.Thursday, 5.Friday");
		System.out.println("Enter a number");
		int a = scanner.nextInt();
		int b;
		switch(a)
		{
		case 1 : System.out.println("Select your slot");
		System.out.println("1. 10AM, 2. 11AM, 3. 12PM");
		b = scanner.nextInt();
		switch (b)
		{
			case 1 : System.out.println("Your appoinment is booked at 10 AM Monday");
			break;
			case 2 : System.out.println("Your appoinment is booked at 11 AM Monday");
			break;
			case 3 : System.out.println("Your appoinment is booked at 12 PM Monday");
			break;
			default : System.out.println("Invalid input");
			break;
		}
		break;
		case 2 : System.out.println("Select your slot");
		System.out.println("1. 10AM, 2. 11AM, 3. 12PM");
		b = scanner.nextInt();
		switch (b)
		{
			case 1 : System.out.println("Your appoinment is booked at 10 AM Tuesday");
			break;
			case 2 : System.out.println("Your appoinment is booked at 11 AM Tuesday");
			break;
			case 3 : System.out.println("Your appoinment is booked at 12 PM Tuesday");
			break;
			default : System.out.println("Invalid input");
			break;
		}
		break;
		case 3 : System.out.println("Select your slot");
		System.out.println("1. 10AM, 2. 11AM, 3. 12PM");
		b = scanner.nextInt();
		switch (b)
		{
			case 1 : System.out.println("Your appoinment is booked at 10 AM Wednessday");
			break;
			case 2 : System.out.println("Your appoinment is booked at 11 AM Wednessday");
			break;
			case 3 : System.out.println("Your appoinment is booked at 12 PM Wednessday");
			break;
			default : System.out.println("Invalid input");
			break;
		}
		break;
		case 4 : System.out.println("Select your slot");
		System.out.println("1. 10AM, 2. 11AM, 3. 12PM");
		b = scanner.nextInt();
		switch (b)
		{
			case 1 : System.out.println("Your appoinment is booked at 10 AM Thursday");
			break;
			case 2 : System.out.println("Your appoinment is booked at 11 AM Thursday");
			break;
			case 3 : System.out.println("Your appoinment is booked at 12 PM Thursday");
			break;
			default : System.out.println("Invalid input");
			break;
		}
		break;
		case 5 : System.out.println("Select your slot");
		System.out.println("1. 10AM, 2. 11AM, 3. 12PM");
		b = scanner.nextInt();
		switch (b)
		{
			case 1 : System.out.println("Your appoinment is booked at 10 AM Friday");
			break;
			case 2 : System.out.println("Your appoinment is booked at 11 AM Friday");
			break;
			case 3 : System.out.println("Your appoinment is booked at 12 PM Friday");
			break;
			default : System.out.println("Invalid input");
			break;
		}
		default : System.out.println("Invalid input");
		break;
		}
	}

}
