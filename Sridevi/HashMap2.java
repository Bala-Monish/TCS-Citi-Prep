import java.util.*;  
public class HashMap2 {  
   public static void main(String args[]) {  
    HashMap<Integer,String> map=new HashMap<Integer,String>();          
      map.put(100,"One");    
      map.put(101,"Two");    
      map.put(102,"three");  
      map.put(103, "four");  
    System.out.println("Initial list of elements: "+map);  
    //key-based removal  
    map.remove(100);  
    System.out.println("Updated list of elements: "+map);   
    //key-value pair based removal  
    map.remove(102, "three");  
    System.out.println("Updated list of elements: "+map);  
   }      
}