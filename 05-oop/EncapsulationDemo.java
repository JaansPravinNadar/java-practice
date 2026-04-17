/*
 * Problem: Understanding Encapsulation
 *
 * Description:
 * Learn how to hide data using private variables
 * and access them safely using getters and setters.
 *
 * Expected Output:
 * --- Student Details ---
 * Name: Jaans Pravin
 * Roll No: 50
 * CGPA: 8.5
 *
 * After invalid CGPA attempt:
 * CGPA: 8.5
 *
 * KEY CONCEPTS:
 * - Encapsulation = Data hiding + controlled access
 * - private = variable can only be accessed inside class
 * - public getter = read/access the value
 * - public setter = update/set the value
 * - Validation can be added in setter methods
 *
 * ANALOGY:
 * ATM machine:
 * - Money is hidden inside (private)
 * - You can't touch money directly
 * - You use buttons/options (getters/setters) to interact safely
 *
 * Concepts used: private, public, getters, setters, validation
 */
class Student1{
private String name;
private int rollNo;
private double cgpa;

public void setName(String name){
    this.name=name;
}
public void setRollNo(int rollNo){
    this.rollNo=rollNo;
}
public void setCgpa(double cgpa){
    if(cgpa>=0 && cgpa<=10){
        this.cgpa=cgpa;
    }else{
        System.out.println("INVALID : The cgpa should be in between 0 - 10 only");
    }
}

public String getName(){
    return name;
}
public int getRollNo(){
    return rollNo;
}
public double getCgpa(){
    return cgpa;
}

public void displaydetails(){
    System.out.println("Name: "+getName());
    System.out.println("Roll No: "+getRollNo());
    System.out.println("CGPA: "+getCgpa());
    System.out.println();
}

}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Student1 s1=new Student1();

        System.out.println("--- Student Details ---");
        s1.setName("Jaans Pravin");
        s1.setRollNo(50);
        s1.setCgpa(8.5);
        s1.displaydetails();

        //s1.cgpa=8.5; // This will give an error of like u cant access it from this class {error: cgpa has private access in Student}
        
        System.out.println("Trying invalid CGPA (15.0):");
        s1.setCgpa(15.0);
    }
}