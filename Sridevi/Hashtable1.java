import java.util.*;  
class Hashtable1{  
 public static void main(String args[]){  
  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
  
  hm.put(100,"one");  
  hm.put(102,"two");  
  hm.put(101,"three");  
  hm.put(103,"four");  
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  