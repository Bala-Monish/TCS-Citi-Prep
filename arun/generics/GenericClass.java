public class GenericClass<T> {
   private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {
      GenericClass<Integer> integerC = new GenericClass<Integer>();
      GenericClass<String> stringC = new GenericClass<String>();
    
      integerC.add(new Integer(10));
      stringC.add(new String("Hello World"));

      System.out.printf("Integer Value: %d\n\n", integerC.get());
      System.out.printf("String Value: %s\n", stringC.get());
   }
}