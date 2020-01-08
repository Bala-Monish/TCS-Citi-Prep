class Student{
	// variable declarations
	int id;
	// id = 22; // its illegal to use here but use inside method*
	// static int count = 25; // static variable
	
	String name;
	String gender;
	
	// method definitions
	boolean updateProfile(String newName){
		// id = 22; // *here
		// boolean result = true; // newName & result are Local variable
		name = newName;
		return true;
	}
}
