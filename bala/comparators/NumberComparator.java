package comparators;

import java.util.Comparator;

public class NumberComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getNumber() > o2.getNumber()) {
			return 1;
		}else if(o1.getNumber() < o2.getNumber()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
