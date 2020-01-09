package Lambda;

import java.util.Scanner;

public class lambdaExpArgu {
	
	interface MyString {
		String myStringFunction(String str);
	}
	
	interface YourString{
		String yourStringFunction(String str);
	}

	public static String reverseStr(MyString reverse, YourString takethis){
	  return reverse.myStringFunction(takethis.yourStringFunction(""));
	}

	public static void main (String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an String: ");
		YourString takethis = (str) -> input.next();
		
		
		// Block lambda to reverse string
		MyString reverse = (str) -> {
			String result = "";
			
			for(int i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);
			
			return result;
		};

		// Output: 
		System.out.println(reverseStr(reverse, takethis)); 
		input.close();
	}

}
