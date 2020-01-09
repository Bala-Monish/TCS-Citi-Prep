import java.util.*;  
class Sort{  
public static void main(String args[]){  
  
ArrayList<String> al=new ArrayList<String>();  
al.add("one");  
al.add("two");  
al.add("eleven");  
al.add("five");  
  
Collections.sort(al);  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
}  
}  