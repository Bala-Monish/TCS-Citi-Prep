package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import comparators.Student;

public class MapExamples {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		Student s1 = new Student(5,  "Bala5");
		Student s2 = new Student(3,  "Bala3");
		Student s3 = new Student(1,  "Bala1");
		Student s4 = new Student(4,  "Bala4");
		Student s5 = new Student(10,  "Bala10");
		Student s6 = new Student(6,  "Bala6");
		map.put(s1.getNumber()+"", s1);
		map.put(s2.getNumber()+"", s2);
		map.put(s3.getNumber()+"", s3);
		map.put(s4.getNumber()+"", s4);
		map.put(s5.getNumber()+"", s5);
		map.put(s6.getNumber()+"", s6);
		System.out.println(map);
		
	}

}
