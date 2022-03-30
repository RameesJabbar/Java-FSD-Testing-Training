//size and array elements are taken from user
package day07;

import java.util.Scanner;

public class One_Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+size+" array elements");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Array elements are : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
