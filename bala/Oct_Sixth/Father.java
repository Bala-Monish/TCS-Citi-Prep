package Oct_Sixth;

public interface Father {
	String str = "";
	void teach();
	void strict(); //abstract
	
	public default void interfaceMethod() {
		System.out.println("zfhdsg");
	}
}
