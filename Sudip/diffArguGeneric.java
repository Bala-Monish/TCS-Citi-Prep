package Generic;

//generic functions that can be called with different types of arguments based on the 
//type of arguments passed to generic method, the compiler handles each method.

class diffArguGeneric 
{ 
    // A Generic method example 
    static <T> void genericDisplay (T element) 
    { 
        System.out.println(element.getClass().getName() + " = " + element);
    } 
   
    // Driver method 
    public static void main(String[] args) 
    { 
         // Calling generic method with Integer argument 
        genericDisplay(11); 
   
        // Calling generic method with String argument 
        genericDisplay("GeeksForGeeks"); 
   
        // Calling generic method with double argument 
        genericDisplay(1.0); 
    } 
}