/*
 * Problem: Understanding Method Overriding
 *
 * Description:
 * Learn runtime polymorphism using method overriding.
 * Child class changes the behavior of parent method.
 *
 * Expected Output:
 * --- Method Overriding ---
 * Animal makes a sound
 * Dog barks: Woof Woof!
 * Cat meows: Meow Meow!
 *
 * KEY CONCEPTS:
 * - Parent and child class have SAME method name
 * - SAME parameters (unlike overloading!)
 * - Child gives its OWN implementation
 * - Decided at RUNTIME (not compile time)
 *
 * DIFFERENCE from Overloading:
 * Overloading = Same name, DIFFERENT parameters
 * Overriding  = Same name, SAME parameters, DIFFERENT class
 *
 * Concepts used: Polymorphism, Method Overriding, Inheritance
 */
class Animal{
    void sound(){
        System.out.println("Animal makes sound...");
    }
}
class Cat extends Animal{
    void sound(){
    System.out.println("Cat making sound: Meow Meow");
    }
}
class Dog extends Animal{ 
    void sound(){
        System.out.println("Dog making sound: Woof Woof");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        System.out.println("--- Method Overriding ---");
        Animal a= new Animal();
        Cat c= new Cat();
        Dog d= new Dog();

        a.sound();
        c.sound();
        d.sound();
    }
}