class Animal{  
void pets(){System.out.println("i love pets");}  
}  
class Dog extends Animal{  
void husky(){System.out.println("husky is cute");}  
}  
class Cat extends Animal{  
void black(){System.out.println("cats drink milk");}  
}  
class TestInheritance3{  
public static void main(String args[]){  
Cat c=new Cat();  
c.black();  
c.pets();  
}}  