import java.util.*;  
class ArrayList2{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>(); 
  list.add("hello");//Adding object in arraylist  
  list.add("this");  
  list.add("is");  
  list.add("new list");   
  Iterator itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}