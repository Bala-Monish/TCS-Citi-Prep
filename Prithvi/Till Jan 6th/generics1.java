import java.util.*;  
class generics1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();  
list.add("Ole");  
list.add("Rashford");  
 
  
String s=list.get(1);  
System.out.println("element is: "+s);  
  
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}