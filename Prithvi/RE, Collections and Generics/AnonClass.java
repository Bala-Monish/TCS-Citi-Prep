class A{
    public void show(){
        System.out.println("Anonymous class Example");
    }
}
/*class B extends A {
    public void show(){
        System.out.println("Example to show an Anonymous class work");
    }
} */
public class AnonClass{
    public static void main(String[] args) {
        // A obj = new B(); instead
        A obj = new A(){

        
            public void show(){
                System.out.println("Example to show how an Anonymous class work");
            }
        };
        obj.show();   
    }
}