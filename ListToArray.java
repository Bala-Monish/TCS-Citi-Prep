package List;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list      = new ArrayList<String>();

		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 3");

		Object[] MyList = list.toArray();

	}

}
