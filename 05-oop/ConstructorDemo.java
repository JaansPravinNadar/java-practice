 /*
 * Problem: Understanding Constructors and this keyword
 *
 * Description:
 * Learn how constructors work and why 'this' keyword is needed.
 * Compare creating objects with and without constructors.
 *
 *
 * --- With Parameterized Constructor ---
 * Name: Jaans Pravin
 * Roll No: 50
 * CGPA: 8.5
 *
 * Name: Toji
 * Roll No: 54
 * CGPA: 8.3
 *
 * KEY CONCEPTS:
 * - Constructor = Special method that runs automatically when object is created
 * - Constructor name = SAME as class name
 * - Constructor has NO return type (not even void!)
 * - Default Constructor = No parameters (Java provides it automatically)
 * - Parameterized Constructor = Takes parameters to initialize values
 * - this.variable = refers to instance variable of current object
 * - this keyword solves naming conflict between parameter and instance variable
 *
 * ANALOGY:
 * Constructor = Filling a form when you JOIN a college
 * You fill name, roll, cgpa at the time of joining (object creation)
 * Not separately after joining!
 *
 * Concepts used: Constructor, this keyword, Object creation
 */
class Student{
    String name ;
    int rollNo;
    double cgpa;

    Student(String name,int rollNo,double cgpa){
        this.name=name;
        this.rollNo=rollNo;
        this.cgpa=cgpa;
    }
    public void displayinfo(){
        System.out.println("Name: "+name);
        System.out.println("RollNo: "+rollNo);
        System.out.println("CGPA: "+cgpa);
        System.out.println();
    }
}


public class ConstructorDemo {
    public static void main(String[] args) {
    System.out.println("--- With Parameterized Constructor ---");
    Student s1=new Student("Jaans Pravin",50,8.5);
    Student s2=new Student("Toji",54,8.3);

    s1.displayinfo();
    s2.displayinfo();
    }
}
 
    

