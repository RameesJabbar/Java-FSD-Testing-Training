package day13;

import java.util.*;
//import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> sample = new ArrayList<String>();
		sample.add("Honda");
		sample.add("Skoda");
		sample.add("BMW");
		sample.add("Maruthi");
		Iterator itr = sample.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
