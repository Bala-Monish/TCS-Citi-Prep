import java.io.*;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 4, 66,2,3));
		System.out.println("Print using iterator: \n");
		Iterator it = numbers.iterator();
		while(it.hasNext()) {
			System.out.print(" " + it.next());
		}
		
		
	}
}
