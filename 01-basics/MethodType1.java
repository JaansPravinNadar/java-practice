/*
 * Problem: Method Without Parameters and Return
 *
 * Description:
 * Write a program that demonstrates a method
 * which takes NO input and returns NOTHING (void).
 *
 * Expected Output:
 * --- Method Type 1 ---
 * Name: Jaans Pravin Nadar
 * Age : 19
 * College: SFIT
 * Course: Information Technology Engineering
 *
 * Concepts used: void method, no parameters
 */

public class MethodType1 {
    
    // Method - no parameters, no return (void)
    public static void displayinfo(){
        System.out.println("Name : Jaans Pravin Nadar");
        System.out.println("Age : 19");
        System.out.println("College: SFIT");
        System.out.println("Course: Information Technology Engineering");
    }
    public static void main(String[] args) {
        
        System.out.println("--- Method Type 1 ---");
        displayinfo();
        
    }
}