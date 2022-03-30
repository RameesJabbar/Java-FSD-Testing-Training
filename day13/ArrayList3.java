package day13;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<String> sample = new ArrayList<String>();
		sample.add("Honda");
		sample.add("Skoda");
		sample.add("BMW");
		sample.add("Maruthi");
		for(String car:sample)
		{
			System.out.println(car);
		}
	}

}
