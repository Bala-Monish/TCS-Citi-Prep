import java.io.*;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1,24,56,7,2));
		System.out.println("Queue first peek: " + numbers.peek());
		System.out.println("Queue contains 8: " + (numbers.contains(8) ? "yes": "no"));
	}
}
