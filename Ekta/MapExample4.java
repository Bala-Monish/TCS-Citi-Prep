import java.util.Collection;
	import java.util.HashMap;
	import java.util.Map.Entry;
	import java.util.Set;
public class MapExample4 {


	public static void main(String[] args)
    {


        HashMap<Integer, String> map = new HashMap<Integer, String>();



        map.put(1, "AAA");

        map.put(2, "BBB");

        map.put(3, "CCC");

        map.put(4, "DDD");

        map.put(5, "EEE");



        Set<Integer> keySet = map.keySet();

        for (Integer key : keySet)
        {
            System.out.println(key);
        }
        Collection<String> values = map.values();

	        for (String value : values)
	        {
	            System.out.println(value);
        }


        HashMap<String, String> map1 = new HashMap<String, String>();



	        map1.put("ONE", "AAA");

	        map1.put("TWO", "BBB");

	        map1.put("THREE", "CCC");

	        map1.put("FOUR", "DDD");

	        map1.put("FIVE", "EEE");



	        Set<Entry<String, String>> keyValueSet = map1.entrySet();

	        for (Entry<String, String> entry : keyValueSet)
	        {
	            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

}

