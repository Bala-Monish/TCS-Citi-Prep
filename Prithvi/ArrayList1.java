import java.util.*;  
class ArrayList1{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Ole");  
  al.add("Rashford");  
  al.add("Martial");  
  al.add("Greenwood");  
   //Traversing list through for-each loop  
  for(String obj:al)  
    System.out.println(obj);  
 }  
}