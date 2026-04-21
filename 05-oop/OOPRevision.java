/*
 * OOP REVISION - All 4 Pillars in One File
 *
 * 4 PILLARS OF OOP:
 * 1. Encapsulation  = Data hiding (private + getters/setters)
 * 2. Inheritance    = Child gets parent properties (extends)
 * 3. Polymorphism   = One name, many forms (overloading + overriding)
 * 4. Abstraction    = Hide complexity (abstract class + interface)
 *
 * Concepts: All 4 OOP Pillars
 */

class Person{
    private String name;
    private int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){return name;}
    public int getAge(){return age;}

    public void setAge(int age){
        if(age>0){
            this.age=age;
        }else{
            System.out.println("INVALID: Age cannot be negative!");
        }
    }
    void displayInfo(){
        System.out.println("Name: "+name+" | Age: "+age);
    }
}

class Student extends Person{
    private int rollNo;

    Student(String name,int age,int rollNo){
        super(name,age);
        this.rollNo=rollNo;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Roll No: "+rollNo);
    }
    void study(){
        System.out.println(getName()+" is studying!");
    }
    void study(String subject){
        System.out.println(getName()+" is studying "+subject+"!");
    }
    void study(String subject,int hours){
        System.out.println(getName()+" is studying "+subject+" for "+hours+" hours!");
    }
}

abstract class Vehicle{
    String brand;

    Vehicle(String brand){
        this.brand=brand;
    }
    abstract void start();

    void stop(){
        System.out.println(brand+" stopped!");
    }
}

interface Electric{
    void charge();
}

class Car extends Vehicle implements Electric{
    Car(String brand){
        super(brand);
    }
    void start(){
        System.out.println(brand+" car started!");
    }
    public void charge(){
        System.out.println(brand+" is charging!");
    }
}

public class OOPRevision{
    public static void main(String[] args){

        System.out.println("========== OOP REVISION ==========\n");

        System.out.println("--- Encapsulation ---");
        Person p=new Person("Jaans",19);
        p.displayInfo();
        p.setAge(-5);
        p.setAge(20);
        System.out.println("Updated age: "+p.getAge());
        System.out.println();

        System.out.println("--- Inheritance ---");
        Student s=new Student("Jaans",19,50);
        s.displayInfo();
        System.out.println();

        System.out.println("--- Polymorphism (Overloading) ---");
        s.study();
        s.study("Java");
        s.study("DSA",3);
        System.out.println();

        System.out.println("--- Abstraction ---");
        Car car=new Car("Tesla");
        car.start();
        car.stop();
        car.charge();
    }
}