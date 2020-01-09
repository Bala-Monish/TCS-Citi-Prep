
	import java.util.HashMap;
	import java.util.Set;
public class MapExample5 {

public static void main(String[] args) 
    {
        
         
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
         
        
         
        map.put(1, 1.1);
         
        map.put(2, 2.2);
         
        map.put(3, 3.3);
         
        map.put(4, 4.4);
        
        System.out.println(map.size()); 
         
        
         
        System.out.println(map.containsKey(3));     
         
        
         
        System.out.println(map.containsValue(3.3));   
        map.clear();
	         
	        
	         
        System.out.println(map.size());    
    }   

