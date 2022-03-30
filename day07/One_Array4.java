//Enter two arrays and store it in another array
package day07;

import java.util.Scanner;

public class One_Array4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int [] arr1 = new int[size];
		int [] arr2 = new int[size];
		int [] arr3 = new int[size];
		System.out.println("Enter "+size+" elements of first array");
		for (int i=0;i<size; i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter "+size+" elements of Scecond array");
		for (int i=0;i<size; i++)
		{
			arr2[i] = sc.nextInt();
		}
		System.out.print("elements of first array are: ");
		for (int i=0;i<size; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println("");//for new line
		System.out.print("elements of second array are: ");
		for (int i=0;i<size; i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println("");
		System.out.print("Sum of the arrays are :");
		for (int i=0;i<size; i++)
		{
			System.out.print((arr1[i] + arr2[i])+" ");
		}


	}

}
