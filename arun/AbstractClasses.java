// trying out abstract classes
abstract class Animal {
  // Abstract method does not have definition
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("dog sound: bark");
  }
}

class AbstractClasses {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.animalSound();
    dog.sleep();
  }
}