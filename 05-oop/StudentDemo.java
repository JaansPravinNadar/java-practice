/*
 * Problem: Introduction to Classes and Objects
 *
 * Description:
 * Create a Student class to store and display student information.
 * Learn how to create objects and use instance variables and methods.
 *
 * Expected Output:
 * --- Student Details ---
 * Name: Jaans Pravin
 * Roll No: 50
 * CGPA: 8.5
 *
 * Name: Sung Jinwoo
 * Roll No: 51
 * CGPA: 8.49
 *
 * KEY CONCEPTS:
 * - Class = Blueprint/Template for creating objects
 * - Object = Instance created from class using 'new' keyword
 * - Instance Variables = Properties each object has (name, rollNo, cgpa)
 * - Methods = Actions/behaviors that objects can perform
 * - this keyword will be learned later - not needed yet!
 *
 * ANALOGY:
 * Class = Cookie cutter (shape/template)
 * Object = Actual cookie made from that cutter
 * Each cookie can have different data (chocolate chips, plain, etc.)
 *
 * Concepts used: Classes, Objects, Instance Variables, Methods
 */
class Student2{
    String name ;
    int rollNo;
    double cgpa;

    public void displayinfo(){              //don't use static here it will give error since it's a non static variable
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollNo);
        System.out.println("CGPA : "+cgpa);
        System.out.println();

    }
}
public class StudentDemo{
    public static void main(String[] args) {
        System.out.println("--- Student Details ---");
        Student2 s1 = new Student2();
        s1.name="Jaans Pravin";
        s1.rollNo=50;
        s1.cgpa=8.5;

        Student2 s2 = new Student2();
        s2.name="Sung Jinwoo";
        s2.rollNo=51;
        s2.cgpa=8.49;

        s1.displayinfo();
        s2.displayinfo();

    }
}