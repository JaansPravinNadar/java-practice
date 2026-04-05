/*
 * Problem: Simple Interest Calculator
 *
 * Description:
 * A bank needs to calculate simple interest for its customers.
 * Write a program that calculates the simple interest
 * based on principal amount, rate of interest and time.
 *
 * Formula:
 * Simple Interest (SI) = (principal * rate * time) / 100
 *
 * Input:
 * principal = 5000
 * rate      = 5  (in percentage)
 * time      = 3  (in years)
 *
 * Expected Output:
 * Principal : 5000.0
 * Rate      : 5.0%
 * Time      : 3 years
 * Simple Interest = 750.0
 *
 * Concepts used: variables, data types, arithmetic operators
 */

public class SimpleInterest {
    public static void main(String[] args) {
        double principal =5000;
        double rate =5;
        int time =3;

        double SI =(principal*rate*time)/100;

        System.out.println("Principal : "+principal);
        System.out.println("Rate : "+rate+"%");
        System.out.println("Time : "+time+ " years");
        System.out.println("Simple Interest (SI) = "+SI);
    }
}