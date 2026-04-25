/*
 * Problem: Scanner - Taking User Input
 *
 * Description:
 * Learn how to take input from user using Scanner class.
 *
 * Expected Output:
 * Enter your name: Jaans
 * Enter your age: 19
 * Enter your CGPA: 8.5
 *
 * Hello Jaans!
 * You are 19 years old
 * Your CGPA is 8.5
 *
 * KEY CONCEPTS:
 * - Scanner = reads input from user
 * - nextLine() = reads entire line (String)
 * - nextInt() = reads integer
 * - nextDouble() = reads decimal
 * - next() = reads single word
 * - Always close scanner after use!
 *
 * Concepts used: Scanner, user input
 */

import java.util.Scanner;
public class ScannerDemo {

    public static void main(String[] args) {
        //Created a Scanner object
        Scanner jaans=new Scanner(System.in);
        
        //Taking String Input
        System.out.print("Enter your Name:" );
        String name=jaans.nextLine();

        //Taking Integer Input
        System.out.print("Enter your Age: ");
        int age=jaans.nextInt();

        //Taking Double has input
        System.out.print("Enter your CGPA: ");
        double cgpa=jaans.nextDouble();
        System.out.println();


        System.out.println("Hello "+name+" !");
        System.out.println("Your are "+age+" Years Old");
        System.out.println("Your CGPA is "+cgpa);

        jaans.close();
    }
}