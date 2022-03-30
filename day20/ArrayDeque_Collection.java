package day20;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque_Collection {

	public static void main(String[] args) {
		 // Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();
  
        // add() method to insert
        dq.add("To");
        dq.addFirst("Welcome");
        dq.addLast("Java");
  
        System.out.println(dq);
	}

}
