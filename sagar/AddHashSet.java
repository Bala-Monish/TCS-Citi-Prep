
import java.io.*;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> numbers = new HashSet<>(Arrays.asList(1,24,56,7,2));
		System.out.println("Before adding: \n");
		Iterator it = numbers.iterator();
		while(it.hasNext()) {
			System.out.print(" " + it.next());
		}
		numbers.add(4);
		System.out.println("\n After adding: \n");
		it = numbers.iterator();
		while(it.hasNext()) {
			System.out.print(" " + it.next());
		}
		
	}
}
