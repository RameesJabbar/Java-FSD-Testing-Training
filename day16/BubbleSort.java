//bubble sorting
package day16;

import java.util.Scanner;

public class BubbleSort {
	void bubblesort(int arr[])
	{
		int n=arr.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j] < arr[j+1]) 
				{
					//swapping 
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	void printarray(int arr[])
	{
		int n = arr.length;
		System.out.print("Sorted array is : ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array ");
		int size = sc.nextInt();
		int[] arr = new int [size];
		System.out.println("Enter array elements ");
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		obj.bubblesort(arr);
		obj.printarray(arr);
		
	}

}
