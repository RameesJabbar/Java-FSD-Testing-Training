package day07;

import java.util.Scanner;

public class One_array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array = new int[10];
		System.out.println("Enter 10 intiger values");
		for(int i=0;i<10;i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.print("Array elements are :");
		for(int i=0;i<10;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
