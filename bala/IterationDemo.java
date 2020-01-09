import java.util.Map; 
import java.util.HashMap; 
import java.util.Iterator; 
  
class IterationDemo  
{ 
    public static void main(String[] arg) 
    { 
        Map<String,String> demo = new HashMap<String,String>(); 
      
        // enter name/url pair 
      		demo.put("Sample","Program");
		demo.put("Actual","Program1");  
          
        // using iterators 
        Iterator<Map.Entry<String, String>> itr = demo.entrySet().iterator(); 
          
        while(itr.hasNext()) 
        { 
             Map.Entry<String, String> entry = itr.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
        } 
    } 
} 