class BasicsDemo{
	static void arrays(){
		System.out.println("\nInside Array...");
		int[] myArray = new int[] {9, 11, 2, 5, 4, 4, 6};
		System.out.println("Array Length: " + myArray.length);
		System.out.println("Array [1]: " + myArray[1]);
		System.out.println("Array [7]: " + myArray[7]);
		
		
	}
	static double sum(double x, double y){
		return x + y;
	}
	
	static double avg(double x, double y){
		double sum = sum(x, y);
		return sum/2;
	}
	
	static boolean search(int[] list, int key){
		return true;
	}
	
	public static void main(String[] args){
		// arrays();
		
		float d = (float)sum(3.0, 2.0);
		float d2 = (float)avg(3.0, 2.0);
		System.out.println("sum: " + d);
		System.out.println("avg: " + d2);
		
		int[] list = {1, 2};
		search(list, 2);
		
	}
	
	}
