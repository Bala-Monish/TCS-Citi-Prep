package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CollectionsExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("B");
		list.add("A");
		list.add(null);
		list.add("B");
		list.add("ghfgh");
		System.out.println(list);
//		for (String str : list) {
//			if(str.equals("B")) {
////				list.remove(str);
//				list.add("GG");
//			}
//		}
		
		Iterator<String> iteratorList = list.iterator();
		for (Iterator<String> iterator = iteratorList; iterator.hasNext();) {
			String str = (String) iterator.next();
			if(str == null) {
				iterator.remove();
			}
			
		}
		System.out.println(list);
		
		List<String> vector = new Vector<String>();
		vector.add("B");
		vector.add("A");
		vector.add(null);
		vector.add("B");
		vector.add("ghfgh");
		System.out.println(vector);
		
	}

}
