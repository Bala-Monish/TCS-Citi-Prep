// Testing out inheritance

class Calculation {
   int z;
    
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("x + y = "+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("x - y = "+z);
   }
}

public class Inheritance extends Calculation {
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("x * y = "+z);
   }
	
   public static void main(String args[]) {
      int a = 20, b = 10;
      Inheritance test = new Inheritance();
      test.addition(a, b);
      test.Subtraction(a, b);
      test.multiplication(a, b);
   }
}