package WildCardGeneric;
import java.util.Arrays; 
import java.util.List; 

//Lower Bound WildCard -  It is expressed using the wildcard character (‘?’), 
//followed by the super keyword, followed by its lower bound: <? super A>.
  
class lowerBoundWC 
{ 
    public static void main(String[] args) 
    { 
        //Lower Bounded Integer List 
        List<Integer> list1= Arrays.asList(4,5,6,7); 
          
        //Integer list object is being passed 
        printOnlyIntegerClassorSuperClass(list1); 
  
        //Number list 
        List<Number> list2= Arrays.asList(4,5,6,7); 
          
        //Integer list object is being passed 
        printOnlyIntegerClassorSuperClass(list2); 
    } 
  
    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) 
    { 
        System.out.println(list); 
    } 
} 
