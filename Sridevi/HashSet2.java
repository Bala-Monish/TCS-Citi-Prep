import java.util.*;  
class HashSet2{  
 public static void main(String args[]){  
  HashSet<String> set=new HashSet<String>();  
           set.add("One");  
           set.add("two");  
           set.add("three");  
           set.add("four");  
           System.out.println("An initial list of elements: "+set);  
           //Removing specific element from HashSet  
           set.remove("three");  
           System.out.println("After remove(object) method: "+set);  
           HashSet<String> set1=new HashSet<String>();  
           set1.add("five");  
           set1.add("six");  
           set.addAll(set1);  
           System.out.println("Updated List: "+set);  
           //Removing all the new elements from HashSet  
           set.removeAll(set1);  
           System.out.println("After invoking removeAll() method: "+set);  
           //Removing elements on the basis of specified condition  
           set.removeIf(str->str.contains("Six"));    
           System.out.println("After invoking removeIf() method: "+set);  
           //Removing all the elements available in the set  
           set.clear();  
           System.out.println("After invoking clear() method: "+set);  
 }  
} 