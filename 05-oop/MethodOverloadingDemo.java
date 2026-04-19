/*
 * Problem: Understanding Method Overloading
 *
 * Description:
 * Learn compile-time polymorphism using method overloading.
 * Same method name can work with different parameters.
 *
 * Expected Output:
 * --- Method Overloading ---
 * Sum of 2 integers: 30
 * Sum of 3 integers: 60
 * Sum of 2 doubles: 20.5
 *
 * KEY CONCEPTS:
 * - Same method name
 * - Different parameter list
 * - Decided at compile time
 *
 * Concepts used: Polymorphism, Method Overloading
 */
class Calculator{
int add(int a, int b){
    return a+b;
}
int add(int a , int b, int c){
    return a+b+c;
}
double add(double a,double b){
    return a+b;
}
}
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        System.out.println("--- Method Overloading ---");
        Calculator c =new Calculator();
        System.out.println("Sum of 2 Integer: "+c.add(15,15));
        System.out.println("Sum of 3 Integers: "+c.add(20,20,20));
        System.out.println("Sum of 2 doubles: "+c.add(10.0,10.5));
    }
}