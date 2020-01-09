import java.util.*;  
public class Hashtable2 {  
   public static void main(String args[]) {  
  Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
     map.put(100,"one");    
     map.put(102,"two");   
     map.put(101,"three");    
     map.put(103,"four");    
     System.out.println("Before remove: "+ map);     
       map.remove(102);  
       System.out.println("After remove: "+ map);  
   }      
}  