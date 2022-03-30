//string into array
package day07;

import java.util.Scanner;

public class One_Array5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the string Array");
		int size = sc.nextInt();
		System.out.println("Enter the elements of the array");
		String[] array = new String[size];
		for (int i=0;i<size; i++)
		{
			array[i] = sc.next();
		}
		System.out.println("Array elements are");
		for (int i=0;i<size; i++)
		{
			System.out.println(array[i]);
		}
	}

}
