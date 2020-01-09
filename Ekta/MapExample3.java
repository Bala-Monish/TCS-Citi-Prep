import java.util.HashMap;
	import java.util.Map.Entry;
	import java.util.Set;
public class MapExample3 {


public static void main(String[] args)
    {


        HashMap<String, Integer> map = new HashMap<String, Integer>();



        map.put("ONE", 1);

        map.put("TWO", 2);

        map.put("THREE", 3);

        map.put("FOUR", 4);



        map.putIfAbsent("ONE", 111);



        map.putIfAbsent("FIVE", 5);



        Set<Entry<String, Integer>> entrySet = map.entrySet();

        for (Entry<String, Integer> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}