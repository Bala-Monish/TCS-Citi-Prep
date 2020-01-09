package abstraction;

public interface Stuff {
	void StuffDesc();
	public default String myDefaultMethod() {
		System.out.print("This is my default method in interface");
		return "Interface method";
	}
	static void show() {
		System.out.println("Static method in Interface");
	}
}
