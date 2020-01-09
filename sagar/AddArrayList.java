import java.io.*;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 4, 66,2,3));
		System.out.println("Old array: \n");
		for(int value : numbers) {
			System.out.print(value + " ");
		}
		numbers.add(5);
		System.out.println("\n New array: \n");
		for(int value : numbers) {
			System.out.print(value + " ");
		}
		
		
	}
}
