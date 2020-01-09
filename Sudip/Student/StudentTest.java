class StudentTest{
	public static void main(String[] arg){
	//1. creating a new student object
	Student s = new Student();
	
	// s = object
	
	//2. setting student's state. 
	// using . operate. 
	s.id = 1000; // s.id is object.variables(s.id) = 1000 
	s.name = "joan";
	s.gender = "male";
	
	//3. update profile with correct name
	s.updateProfile("john");
	
	}
}
