package day07;

import java.util.Scanner;

public class Q3_Occurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int count = 0;
		System.out.println("Enter the array elements");
		int [] array = new int[size];
		for(int i=0; i<size; i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be check");
		int demo = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(array[i]==demo)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(demo+" is occured in the array");
		}
		else
			System.out.println(demo+" is not occured in the array");
	}

}
