package SBA_4;

import java.util.Scanner;

public class Q1 {
	//bubble sort method
		void bubblesort(int arr[])
		{
			int n=arr.length;
			for(int i=0; i<n-1; i++)
			{
				for(int j=0; j<n-i-1; j++)
				{
					if(arr[j] > arr[j+1]) 
					{
						//swapping 
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		}
		//selection sort method
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
			System.out.print("Sorted array is : ");
			for(int i=0; i<n; i++)
			{
				System.out.print(arr[i]+" ");
			}
		}

	public static void main(String[] args) {
		Q1 obj = new Q1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the choice: ");
		System.out.println("1.Bubble Sort");
		System.out.println("2.Selection Sort");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: 
			obj.bubblesort(arr);;
			obj.printarray(arr);
			break;
		case 2:
			obj.selectionsort(arr);
			obj.printarray(arr);
			break;
		}
		
	}

}
