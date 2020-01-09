import java.util.*; 
public class ArrayListDemo { 
	public static void main(String[] args) 
	{ 
		ArrayList<String> list = new ArrayList<>(); 

		list.add("citi"); 
		list.add("tcs"); 
		list.add("java"); 
		list.add("collections"); 
		list.add("list"); 
		list.add("arraylist"); 
		list.add("iterator"); 
		list.add("example"); 

		System.out.println("The list is: \n" + list); 
		Iterator<String> iter = list.iterator(); 
		System.out.println("\nThe iterator values" + " of list are: "); 
		while (iter.hasNext()) { 
			System.out.print(iter.next() + " "); 
		} 
	} 
}