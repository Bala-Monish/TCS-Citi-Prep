/**
 * 
 */

/**
 * @author Deshica Bolledula
 *
 */
/*
 * public class Stack { private int[] stack; private int top; private int size;
 * public Stack() {
 * 
 * }
 * 
 * public IntStack(int size) { top = -1; this.size=size; stack = new int
 * [this.size]; } } public boolean push(int item) { top++; stack[top]= item;
 * return true; } public boolean isFull() { return (top == stack.length -1);
 * 
 * }
 */

import java.util.*;
public class StackDemo {
	
	public static void main(String args[]) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(00);
		s.push(10);
		s.push(20);
		s.push(30);
				
		System.out.println("Display:" + s);
		
		s.pop();
		System.out.println("Display after pop:" + s);
		
		s.peek();
		System.out.println("Display after peek:" + s);
		
		System.out.println("Checks if stack has 10:" + (s.contains(10)));
		
		Iterator value = s.iterator();
		System.out.println("The value next: " + value.hasNext());
		while (value.hasNext())
			System.out.println(value.next());
		
		for(int i=0; i<=10; i= i+3)
			System.out.println("The Even Number :" + i);
			
		
		s.clear();
		System.out.println("Display after Clearing:" + s);
		
		
		
	}

}