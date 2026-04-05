/*
 * Problem: Circle Area Calculator
 *
 * Description:
 * Write a program that calculates the area of a circle
 * based on the radius provided.
 *
 * Formula:
 * Area = 3.14159 * radius * radius
 *
 * Input:
 * radius = 7
 *
 * Expected Output:
 * Radius : 7
 * Area of Circle = 153.93791
 *
 * Concepts used: variables, data types, arithmetic operators
 */

public class CircleArea {
    public static void main(String[] args) {
        int radius =7;
        double Area = Math.PI*radius*radius;
        
        System.out.println("Radius : "+radius);
        System.out.println("Area of Circle = "+Area);
    }
}