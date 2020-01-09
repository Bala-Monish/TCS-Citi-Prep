package Oct_Sixth;

public class Son extends GrandFather implements Mother,Father{

	public String example = "Sub Class";
	
	{
		System.out.println("Instance Block Executed");
	}
	@Override
	public void teach() {
		System.out.println("Multiple Inheritance");
		System.out.println(this.example);
		System.out.println("This is usage of super "+super.example);
	}

	public static void myStaticMethod() {
		System.out.println("My Static Method");
	}
	@Override
	public void strict() {
		System.out.println("zbsd");
	}

	@Override
	public void love() {
		// TODO Auto-generated method stub
		
	}
	public void testMethod() {
		System.out.println("Derived Class Method");
	}
	public void interfaceMethod() {
		System.out.println("zfhdsg");
	}
	
}
