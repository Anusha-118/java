// Parent class
class Animal {
  void sound() {
    System.out.println("Animal makes a sound");
  }
}

// Child class
class Dog extends Animal {
  // Overriding the sound() method
  void sound() {
    System.out.println("Dog barks");
  }
}

// Main class
class MethodOverridingExample {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Object of parent class
    myAnimal.sound();                // Calls Animal's sound()

    Dog myDog = new Dog();           // Object of child class
    myDog.sound();                   // Calls Dog's overridden sound()
  }
}
