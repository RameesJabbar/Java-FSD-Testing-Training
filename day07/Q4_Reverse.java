package day07;

import java.util.Scanner;

public class Q4_Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the array elements");
		for (int i=0; i<size; i++)
		{
			array[i]=sc.nextInt();
		}
		int temp=(size-1);
		System.out.print("array elements are ");
		for (int i=0; i<size; i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		System.out.print("Reverse of the array is ");
		for (int i=temp; i>=0; i--)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("");
	}

}
