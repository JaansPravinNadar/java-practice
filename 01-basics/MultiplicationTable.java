/*
 * Problem: Multiplication Table
 *
 * Description:
 * Write a program that prints the
 * multiplication table of a given number.
 *
 * Input:
 * n = 5
 *
 * Expected Output:
 * 5 x 1  = 5
 * 5 x 2  = 10
 * 5 x 3  = 15
 * 5 x 4  = 20
 * 5 x 5  = 25
 * 5 x 6  = 30
 * 5 x 7  = 35
 * 5 x 8  = 40
 * 5 x 9  = 45
 * 5 x 10 = 50
 *
 * Concepts used: for loop, arithmetic operators
 */

public class MultiplicationTable {
    public static void main(String[] args) {

        int n= 5;
        System.out.println("-----Table of "+n+"-----");
        for (int i=1; i<=10; i++){
            System.out.println(n+ " X "+i+ " = "+ n*i );
        }
    }
}
