package day08;

import java.util.Scanner;

public class Q4_Occurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s1=sc.nextLine();
		System.out.println("Enter the character to be check ");
		char ch = sc.next().charAt(0); //take character input from user
		int l = s1.length(); //length of the string
		int count = 0;
		for (int i=0; i<l;i++)
		{
			char ch2 = s1.charAt(i);
			if(ch2 == ch)
			{
				count++;
			}
		}
		if (count > 0)
		{
			System.out.println(ch+" is present in the string");
		}
		else
			System.out.println(ch+" is not present in the string");
	}

}
