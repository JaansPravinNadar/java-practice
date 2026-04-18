/*
 * Problem: Understanding Inheritance
 *
 * Description:
 * Learn how child classes inherit properties and
 * methods from parent classes using 'extends' keyword.
 *
 * Expected Output:
 * --- Animal Info ---
 * Name: Animal
 * Age: 5
 * Animal is eating...
 * Animal is sleeping...
 *
 * --- Dog Info ---
 * Name: Bruno
 * Age: 3
 * Breed: Labrodor
 * Animal is eating...
 * Animal is sleeping...
 * Dog is barking: Woff Woff
 * 
 *
 * --- Cat Info ---
 * Name: Kitty
 * Age: 2
 * Animal is eating...
 * Animal is sleeping...
 * Cat is meowing: Meow Meow
 *
 * KEY CONCEPTS:
 * - Inheritance = Child class gets all properties of Parent class
 * - extends keyword = used to inherit from a class
 * - super() = calls the parent class constructor
 * - Child class can have its OWN methods too
 * - Parent class = Super class
 * - Child class = Sub class
 *
 * ANALOGY:
 * Parent = Blueprint of a basic house
 * Child = Customized house built ON TOP of basic blueprint
 * Child gets all basic features + adds its own!
 *
 * Concepts used: Inheritance, extends, super keyword
 */

// Parent class (Super class)

class Animal {
    String name;
    int age;

    //Constructor
    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }
    void eat(){
        System.out.println("Animal is eating ...");
    }
    void sleep(){
        System.out.println("Animal is Sleeping...");
    }
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    
}
class Dog extends Animal{
    String breed;

    //Constructor
    Dog(String name,int age,String breed){
        super(name,age); //call Animal constructor
        this.breed=breed;
    }
    void displayInfo(){
        super.displayInfo();// call animals displayInfo first
        System.out.println("Breed: "+breed);
    }
    void bark(){  //Dogs own property
        System.out.println("Dog is barking: woff woff..");

        //if we want to show the breed of the dog then we have to override the displayinfo
    }
}
class Cat extends Animal{
    String color;

    Cat(String name,int age,String color){ // "Cat doesn't override displayInfo so color won't show"
        super(name,age);
        this.color=color;
    }
    void meow(){
        System.out.println("Cat is meowing : Meow Meow");
    }
}
public class InheritanceDemo{
    public static void main(String[] args) {
        //Create a Animal Object
        System.out.println("--- Animal Info ---");
        Animal a =new Animal("Animal",5);
        a.displayInfo();
        a.eat();
        a.sleep();
        System.out.println();

        //Create Dog Object
        System.out.println("--- Dog Info ---");
        Dog d= new Dog("Max",3,"Labrador");
        d.displayInfo();
        d.eat();
        d.sleep();
        d.bark();
        System.out.println();

        //create a cat Object
        System.out.println("--- Cat Info ---");
        Cat c = new Cat("Kitty",2,"White");
        c.displayInfo();
        c.eat();
        c.sleep();
        c.meow();
    }
}