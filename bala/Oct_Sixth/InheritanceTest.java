package Oct_Sixth;

public class InheritanceTest {
	public static int myMethod() {
		int x = 10;
		int y = 10;
		return x+y;
	}
	public void secondMethod() {
		System.out.println("Non Static Method");
	}
	{
		System.out.println("Instance Block Executed");
	}
	static 
	{
		System.out.println("Static Block Executed");
	}
	
	public static void main(String[] args) {
		
		Son son = new Son();
		//son.teach();
		//int z = myMethod();//Static Methods don't need object creation
		//System.out.println("Static Method "+z);
	//	InheritanceTest nonStaticMethod = new InheritanceTest();
	//	nonStaticMethod.secondMethod();
//		GrandFather grandFather = new GrandFather();
//		grandFather.testMethod();
//		GrandFather myTest = new Son();
//		myTest.testMethod();
	}
}
