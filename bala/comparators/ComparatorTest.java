package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		Student s1 = new Student(5,  "Bala5");
		Student s2 = new Student(3,  "Bala3");
		Student s3 = new Student(1,  "Bala1");
		Student s4 = new Student(4,  "Bala4");
		Student s5 = new Student(10,  "Bala10");
		Student s6 = new Student(6,  "Bala6");
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
//		Collections.sort(list, new NumberComparator());
//		for (Student student : list) {
//			System.out.println(student.getNumber() +"  "+student.getName());
//		}
//		
//		System.out.println("-----------------------------------");
//		Collections.sort(list, new NameComparator());
//		for (Student student : list) {
//			System.out.println(student.getNumber() +"  "+student.getName());
//		}
		
		Comparator<Student> numberComparator = Comparator.comparing(Student::getNumber, Comparator.reverseOrder());
		Collections.sort(list, Comparator.comparing(Student::getNumber).thenComparing(Student::getName));
		for (Student student : list) {
			System.out.println(student.getNumber() +"  "+student.getName());
		}
	}

}
