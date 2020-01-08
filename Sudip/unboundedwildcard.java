package WildCardGeneric;
import java.util.Arrays; 
import java.util.List; 
  
//Unbounded Wildcard: is called a list of unknown type. 
class unboundedwildcard
{ 
    public static void main(String[] args)  
    { 
  
        //Integer List 
        List<Integer> list1 = Arrays.asList(1,2,3); 
  
        //Double list 
        List<Double> list2 = Arrays.asList(1.1,2.2,3.3); 
        
        //String List
        List<String> list3 = Arrays.asList("Some", "Nothing", "Stuff"); 
  
        printlist(list1); 
  
        printlist(list2);
        
        printlist(list3);
    } 
  
    private static void printlist(List<?> list)  
    { 
  
        System.out.println(list); 
    } 
} 