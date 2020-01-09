package comparators;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int number;
	private String name;

	
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (number != student.number) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return number;
    }
	@Override
	public int compareTo(Student o) {
		if(this.getNumber() > o.getNumber()) {
			return 1;
		}else if(this.getNumber() < o.getNumber()) {
			return -1;
		}else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return " Student[number=" + number + ", name=" + name + "]";
	}
	
	

}
