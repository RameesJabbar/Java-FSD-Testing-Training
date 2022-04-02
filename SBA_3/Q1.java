/*Implement an ArrayDequeue and all of its methods such as add(), addFirst(), 
addLast(), element(), poll(), push(), remove.*/

package SBA_3;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Q1 {
	public static void main(String[] args) {
		// Creating and initializing dequeue
        // Declaring object of integer type
        ArrayDeque <Integer> de_que = new ArrayDeque<Integer>(10);
     // Operations 1
        // add() method
 
        // Adding custom elements
        // using add() method to insert
        de_que.add(10);//10,20,30,40,50
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);
 
        // Iterating using for each loop
        for (Integer element : de_que) {
            // Print the corresponding element
            System.out.println("Element : " + element);
        }
        
        System.out.println("Using clear() ");
        
        // Clearing all elements using clear() method
        de_que.clear();
        
     // Operations 2
        // addFirst() method
 
        // Inserting at the start
        de_que.addFirst(564);
        de_que.addFirst(291);
        
     // Operation 3
        // addLast() method
        // Inserting at end
        de_que.addLast(24);
        de_que.addLast(14);
 
        // Display message
        System.out.println(
            "Above elements are removed now");
 
        // Iterators
 
        // Display message
        System.out.println(
            "Elements of deque using Iterator :");
 
        for (Iterator itr = de_que.iterator();
             itr.hasNext();) {
            System.out.println(itr.next());
        }
     
        // Operation 4
        // element() method : to get Head element
        System.out.println(
            "\nHead Element using element(): "
            + de_que.element());
        
        
        // Operation 5
        // poll() method : to get head
        System.out.println("Head element poll : "+ de_que.poll());
 
        // Operation 6
        // push() method
        de_que.push(265);
        de_que.push(984);
        de_que.push(2365); 
 
        // Operation 7
        // remove() method : to get head
        System.out.println("Head element remove : "+ de_que.remove());
 
        System.out.println("The final array is: " + de_que); 
 

}
}