import java.io.*;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1,24,56,7,2));
		System.out.println("Before removing: \n");
		Iterator it = numbers.iterator();
		while(it.hasNext()) {
			System.out.print(" " + it.next());
		}
		numbers.pop();
		System.out.println("After removing: \n");
		it = numbers.iterator();
		while(it.hasNext()) {
			System.out.print(" " + it.next());
		}
		
	}
}
