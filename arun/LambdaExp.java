// testing out lambda expressions 
import java.util.ArrayList; 

class LambdaExp 
{ 
    public static void main(String args[]) 
    { 
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        arr.add(1); 
        arr.add(2); 
        arr.add(3); 
        arr.add(4); 
  
        // print all elements 
        System.out.println("all");
        arr.forEach(n -> System.out.println(n)); 
        
        //  print even elements  
        System.out.println("evens");
        arr.forEach(n -> { if (n%2 == 0) System.out.println(n); }); 
    } 
}