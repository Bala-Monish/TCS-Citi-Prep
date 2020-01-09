import java.util.HashMap; 
import java.util.Map; 

public class HashMapDemo { 
	public static void main(String[] args) 
	{ 
		HashMap<String, Integer> map 
			= new HashMap<>(); 

		print(map); 
		map.put("tcs", 10); 
		map.put("citi", 30); 
		map.put("java", 20); 

		System.out.println("Size of map is:- "
						+ map.size()); 

		print(map); 
		if (map.containsKey("tcs")) { 
			Integer a = map.get("tcs"); 
			System.out.println("value for key"
							+ " \"tcs\" is:- "
							+ a); 
		} 

		map.clear(); 
		print(map); 
	} 

	public static void print(Map<String, Integer> map) 
	{ 
		if (map.isEmpty()) { 
			System.out.println("map is empty"); 
		} 

		else { 
			System.out.println(map); 
		} 
	} 
} 
