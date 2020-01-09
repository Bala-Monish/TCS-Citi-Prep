interface A
{
	int x = 10;
}

interface B
{
	int y = 20;
}


public class SimpleExample implements A,B {
	public static void main(String[] args) {
		
		System.out.println(x);
		System.out.println(y);
	}
	

}
