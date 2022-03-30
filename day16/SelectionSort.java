package day16;

import java.util.Scanner;

public class SelectionSort {
	void selectionsort(int arr[])
	{
		int n = arr.length;
		// One by one move boundary of unsorted sub array
		for(int i=0; i<n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min_idx = i;
			for(int j=i+1; j<n; j++)
			{
				if(arr[min_idx] > arr[j])
				{
					min_idx = j;
				}
			}
			// Swap the found minimum element with the first element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		
	}
	void printarray(int arr[])
	{
		int n = arr.length;
		System.out.println("Sorted array:");
		for(int i=0; i<n; i++)
		{	
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		SelectionSort obj = new SelectionSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array elements");
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		obj.selectionsort(arr);
		obj.printarray(arr);
		
	}

}
