/*
 * Problem: Understanding Abstract Class
 *
 * Description:
 * Learn abstraction using abstract class.
 * Every shape MUST have area but calculates it differently.
 *
 * Expected Output:
 * --- Abstract Class Demo ---
 * Color: Red
 * Area of Circle: 78.5
 *
 * KEY CONCEPTS:
 * - abstract class = incomplete class (has blank methods!)
 * - abstract method = blank method with NO body
 * - Child class MUST fill/implement all abstract methods
 * - Cannot create object of abstract class directly!
 * - Can have BOTH abstract and normal methods
 *
 * ANALOGY:
 * Abstract class = Incomplete house blueprint
 * You cannot LIVE in a blueprint!
 * You must BUILD (extend) it first!
 *
 * Abstract method = Blank field in a form
 * Child class = Filled form (must fill all blanks!)
 *
 * Concepts used: abstract class, abstract method, extends
 */

// Abstract class - cannot create object directly!
abstract class Shape{
    String color;

    Shape(String color){
        this.color=color;
    }
    abstract double areaCalculator();

    void displaycolor(){
        System.out.println("Color: "+color);
    }
}
class Circle extends Shape{
    double radius;
    Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }
    double areaCalculator(){
        return 3.14*radius*radius;
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        System.out.println("--- Abstract Class ---");

        //Cannot create object for Abstract class
        //Can create object for the child class
        Circle c = new Circle("Red",5);
        c.displaycolor();
        System.out.println("Area of Circle: "+c.areaCalculator());
        System.out.println();


    }
}