package SBA_4;

import day16.Q2InsertionSort;

public class Q2 {
	public void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];// 
				j = j - 1;//j=1-1=0
			}
			arr[j + 1] = key;
		}
	}
	/* A utility function to print array of size n*/
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}


	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6 };

		Q2InsertionSort ob = new Q2InsertionSort();
		System.out.println("Sorted array Is:");
		ob.sort(arr);

		printArray(arr);
	}

}



