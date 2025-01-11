//  Base Class
class Animal {
    //    Method in the bane class 
    public void eat () {
        System.out.println(" This animal eat food . ");
    }
}

//  Derived class 
class Dog extends Animal {
    //  Method in the derived class 
    public void bark () {
        System.out.println("This dog barks");
    }
}

// Derived class 
public class SingleInheritanceDemo {
    public static void main (String[] args) {
        // Create an object of the derived class 
        Dog myDog = new Dog();

        // call method from the derived class  
        myDog.eat();  // Inheritance form the base class 
        myDog.bark();  // Defined in the derived class
      }
}