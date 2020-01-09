package abstraction;

abstract public class SecretStuff implements Stuff{
	abstract void description();//abstract method. has to be overridden
	void moreInfo() {
		System.out.println("This is a concrete method");
	}
	@Override
	public void StuffDesc() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String myDefaultMethod() {
		//System.out.println("Overriding default method");
		return "Overriding interface method";
	}
	public static void show() {
		System.out.println("Overriding Static method");
	}
}
