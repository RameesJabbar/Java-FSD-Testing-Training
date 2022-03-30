package day07;

import java.util.Scanner;

public class Q5_Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees");
		int num = sc.nextInt();
		System.out.println("Enter "+num+" Employee names");
		String [] array = new String[num];
		for(int i=0; i<num; i++)
		{
			array[i] = sc.next();
		}
		System.out.println("Enter employee salary");
		double[] array1 = new double[num];
		for(int i=0; i<num; i++)
		{
			array1[i] = sc.nextDouble();
		}
		System.out.println("Enter Year of joining");
		int [] array2 = new int[num];
		for(int i=0; i<num; i++)
		{
			array2[i] = sc.nextInt();
		}
		System.out.println("Employee Details:");
		for(int i=0; i<num; i++)
		{
			System.out.println("Name: "+array[i]);
			System.out.println("Salary: "+array1[i]);
			System.out.println("Year of joining: "+array2[i]);
			System.out.println("");
		}
		
		
	}

}
