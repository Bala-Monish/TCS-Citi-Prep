import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        
        list.ensureCapacity(20);
 
        
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        
        list.trimToSize();
    }

}
