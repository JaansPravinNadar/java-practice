/*
 * Problem: Swap Two Numbers
 *
 * Description:
 * Write a program that swaps the values of two variables
 * without using a third variable.
 *
 * Input:
 * a = 10
 * b = 20
 *
 * Expected Output:
 * Before Swap: a = 10, b = 20
 * After Swap:  a = 20, b = 10
 *
 * Hint:
 * a = a + b
 * b = a - b
 * a = a - b
 *
 * Concepts used: variables, arithmetic operators
 */

public class SwapNumbers {
    public static void main(String[] args) {

        int a =10;
        int b= 20;
         
        //Time for Swapping 

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Before Swap: a = "+b+", b = "+a);
        System.out.println("After Swap: a = "+a+ ", b = "+b);

    }
}