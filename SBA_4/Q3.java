package SBA_4;

import java.util.Hashtable;

public class Q3 {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(105, "Ashok");
		ht.put(103, "Surya");
		ht.put(101, "Rahul");
		ht.put(102, "Ravi");
		ht.put(104, "Ajith");
		ht.put(100, "Vijay");
		System.out.println("Initial Map");
		System.out.println(ht);
		System.out.println("After removing 100");
		ht.remove(100);
		System.out.println(ht);
		ht.putIfAbsent(100, "Sanal");
		System.out.println("Updated Map");
		System.out.println(ht);
		System.out.println(ht.getOrDefault(104, "Not found"));
		System.out.println(ht.getOrDefault(108, "108 Not found"));
		System.out.println("Size of the map is: "+ht.size());
		System.out.println("Is the list empty?: "+ht.isEmpty());
		ht.clear();
		System.out.println("After clearing"+ht);
		System.out.println("Is the list empty?: "+ht.isEmpty());
		
	}

}
