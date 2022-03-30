package day08;

import java.util.Scanner;

public class Q5_palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String [] arr = str.split(" ");
		char rev ;
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = arr[i].trim();
			System.out.println(arr[i]);
			for(int j=0; j<arr[i].length(); j++)
			{
				char demo = arr[i].charAt(j);
			}
			
		}
		
	}

}
