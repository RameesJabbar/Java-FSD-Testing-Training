/*Implement a Stack and all of its methods peek(), push(), pop(), 
and to determine the size of the stack.*/

package SBA_3;

import java.util.Stack;

public class Q3 {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		System.out.println("Stack is empty?");
		boolean result = stk.empty();
		System.out.println(result);
		stk.push(12);
		stk.push(23);
		stk.push(18);
		stk.push(34);
		stk.push(20);
		stk.push(9);
		System.out.println("After pushing ");
		System.out.println(stk);
		result = stk.empty();
		System.out.println("Stack is empty?");
		System.out.println(result);
		stk.pop();
		System.out.println("After Pop ");
		System.out.println(stk);
		System.out.println("Peek value is : "+stk.peek());
		int search = stk.search(18);
		System.out.println("Position of '18' is at: "+search);
		int size = stk.size();
		System.out.println("Size of the Stack is: "+size);
	}

}
