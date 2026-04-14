/*
 * Problem: Simple Method Demo
 *
 * Description:
 * Write a program that demonstrates a basic method.
 * Create a method that prints a welcome message.
 *
 * Expected Output:
 * --- Calling Method ---
 * Hello! Welcome to Java Methods
 * This is my first method!
 *
 * Concepts used: method definition, method calling
 */

public class SimpleMethodsDemo {
    
    // Method definition - write OUTSIDE main()
    public static void printwelcome(){
        System.out.println("Hello! Welcome to Java Methods");
        System.out.println("This is my first method !");
    }

    public static void main(String[] args) {
        
        System.out.println("--- Calling Method ---");
                printwelcome();
    }
}

/*
 * A method is a mini-program that helps us call a segment of code. 
 * This increases reusability because we can run that code whenever we want instead of writing it again and again
 */