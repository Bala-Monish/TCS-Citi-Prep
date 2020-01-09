import java.util.*;  
class TestSort{  
public static void main(String args[]){  
  
ArrayList<String> al=new ArrayList<String>();  
        al.add("one");    
        al.add("two");    
        al.add("eleven");    
        al.add("five");   
          
        Collections.sort(al,Collections.reverseOrder());  
        Iterator i=al.iterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
}  
} 