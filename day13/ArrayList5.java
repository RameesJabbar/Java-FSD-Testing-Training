package day13;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial list of elements "+al);
		//adding elements to the end of the list
		al.add("Ravi");
		al.add("Ajay");
		al.add("Vijay");
		System.out.println("After invoking add() method:-"+al);
		//adding one element at specific position 
		al.add(1,"Akash");
		System.out.println("After invoking add function"+al);
		ArrayList<String> al2= new ArrayList<String>();
		al2.add("Akshay");
		al2.add("Mohan");
		al2.add("Kumar");
		al2.add("Avinash");
		//adding second list of elements to the first list
		al.addAll(al2);
		System.out.println("After invoking addAll method:- "+al);
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Ramees");
		al3.add("Roshan");
		al.addAll(al3);
		System.out.println("After adding third list"+al);
		
	}

}
