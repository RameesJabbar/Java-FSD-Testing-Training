package day13;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<String> sample = new ArrayList<String>();
		sample.add("Honda");
		sample.add("Skoda");
		sample.add("BMW");
		sample.add("Maruthi");
		System.out.println(sample.get(1));
		sample.set(2, "Renault"); //2nd index replaced with renault
		for(String car:sample)
		{
			System.out.println(car);
		}
	}

}
