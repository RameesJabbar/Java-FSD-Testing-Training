package day13;

import java.util.*;

public class Q1_ArrayList {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(134.5);
		al.add(34.6);
		al.add(100.1);
		al.add(68.8);
		al.add(89.6);
		System.out.println("Before Sorting : "+al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("After Sorting : "+al);
	
		
	}

}
