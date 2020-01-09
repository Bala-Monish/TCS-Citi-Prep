import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {
	 public static void main(String[] args)
	    {
	        HashSet<Student> set = new HashSet<Student>();



	        set.add(new Student("Ekta", 121, "ECE"));

	        set.add(new Student("Ronak", 101, "EEE"));

	        set.add(new Student("Mahima", 151, "Civil"));

	        set.add(new Student("Priyanka", 200, "IT"));

	        set.add(new Student("Dhrumil", 550, "CS"));

	        set.add(new Student("Ekta", 301, "IT"));

	        set.add(new Student("Abc", 301, "IT"));

	        set.add(new Student("Hena", 872, "ECE"));

	        set.add(new Student("Sam", 301, "CS"));

	        set.add(new Student("Binal", 565, "Civil"));



	        Iterator<Student> it = set.iterator();

	        while (it.hasNext())
	        {
	            Student student = (Student) it.next();

	            System.out.println(student);
	        }
	    }
}
class Student
{
    String name;

    int rollNo;

    String department;

    public Student(String name, int rollNo, String department)
    {
        this.name = name;

        this.rollNo = rollNo;

        this.department = department;
    }

    @Override
    public int hashCode()
    {
        return rollNo;
    }

    @Override
    public boolean equals(Object obj)
    {
        Student student = (Student) obj;

        return (rollNo == student.rollNo);
    }

    @Override
    public String toString()
    {
        return rollNo+", "+name+", "+department;
    }
}

