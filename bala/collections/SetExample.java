package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import comparators.Student;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("B");
		set.add("Z");
		set.add("A");
		set.add(null);
		set.add("B");
		set.add("g");
		System.out.println(set);
		
		Set<Student> studentSet = new HashSet<Student>();
		Student s1 = new Student(5,  "Bala5");
		Student s2 = new Student(3,  "Bala3");
		Student s3 = new Student(1,  "Bala1");
		Student s4 = new Student(4,  "Bala4");
		Student s5 = new Student(10,  "Bala10");
		Student s6 = new Student(6,  "Bala6");
		
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		studentSet.add(s4);
		studentSet.add(s5);
		studentSet.add(s6);
		System.out.println(studentSet);
		for (Student student : studentSet) {
			System.out.println(student.getNumber() +"  "+student.getName());
		}
		System.out.println("Sorted Set - default sorting");
		SortedSet<Student> sortedSet = new TreeSet<Student>();
//		sortedSet.add("B");
//		sortedSet.add("Z");
//		sortedSet.add("A");
//		//sortedSet.add(null);
//		sortedSet.add("B");
//		sortedSet.add("g");
//		System.out.println(sortedSet);
		sortedSet.add(s1);
		sortedSet.add(s2);
		sortedSet.add(s3);
		sortedSet.add(s4);
		sortedSet.add(s5);
		sortedSet.add(s6);
		//System.out.println(sortedSet);
		for (Student student : sortedSet) {
			System.out.println(student.getNumber() +"  "+student.getName());
		}
	}

}
