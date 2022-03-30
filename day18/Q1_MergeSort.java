package day18;

import java.util.Scanner;

public class Q1_MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the array :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter array elements:");
		for (int i=0; i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		msort(arr, 0, arr.length-1);
		printarray(arr);
	}

	
	
	private static void printarray(int[] arr) {
		
		System.out.print("Sorted Array is: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	private static void msort(int [] arr, int i,int j)
	{
		if(i<j)
		{
			int mid = (i+j)/2;
			msort(arr,i,mid);
			msort(arr,mid+1,j);
			merge(arr,i,mid,j);
		}
	}
	private static void merge(int[] arr, int low, int mid, int high) {
		int i = low;
		int j = mid+1;
		int k = low;
		int [] b = new int[arr.length];
		while(i<=mid && j<=high)
		{
			if(arr[i] < arr[j])
			{
				b[k] = arr[i];
				i++;
				k++;
			}
			else
			{
				b[k] = arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid)
		{
			b[k] = arr[i];
			i++;
			k++;
		}
		while(j<=high)
		{
			b[k] = arr[j];
			j++;
			k++;
		}
		for(i=low; i<=high; i++)
		{
			arr[i] = b[i];
		}
		
	}
	
}
