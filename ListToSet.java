package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list      = new ArrayList<String>();

		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 3");

		Set<String> set = new HashSet<String>();
		set.addAll(list);

	}

}
