package Generic;

import java.util.*; 

class handlingErrGeneric 
{ 
	// this will get error on runtime
	
    /*public static void main(String[] args) 
    { 
        // Creating an ArrayList without any type specified 
        ArrayList al = new ArrayList(); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
        al.add(10); // Compiler allows this 
  
        String s1 = (String)al.get(0); 
        String s2 = (String)al.get(1); 
  
        // Causes Runtime Exception 
        String s3 = (String)al.get(2); 
    }*/
    
	// this will cause compile error
/*    public static void main(String[] args) 
    { 
        // Creating an ArrayList without any type specified 
        ArrayList <String> al = new ArrayList<String>(); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
        al.add(10); // this causes compile time error
  
        String s1 = (String)al.get(0); 
        String s2 = (String)al.get(1); 
        String s3 = (String)al.get(2); 
    } 
*/    
    public static void main(String[] args) 
    { 
        // Creating an ArrayList with type specified and typecasting is not need b/c of <String>
        ArrayList <String> al = new ArrayList<String>(); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
        al.add("Something");
  
        String s1 = al.get(0); 
        String s2 = al.get(1); 
        String s3 = al.get(2); 
        
        System.out.println(s1 +" "+ s2 +" "+ s3);
    } 
} 
