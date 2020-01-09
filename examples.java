/**
 * 
 */

/**
 * @author Deshica Bolledula
 *
 */
public class examples 
{
	
	public static void main(String[] args) 
	{
		// Declares an Array of integers.
		int intarr[];
		int top;
		intarr = new int[5];
		
		
		//initialize the first elements of the array
		intarr[0] =10;
		
		//initialize the second elements of the array
		intarr[1] =20;
		
		//initialize the third elements of the array
		intarr[2] =30;
		
		//accessing the elements of the specified array
		for (int i=0; i < intarr.length; i++)
			System.out.println("Element at index" + i + ":" + intarr[i]);
	}

}
