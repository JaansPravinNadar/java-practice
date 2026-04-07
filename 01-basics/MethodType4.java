/*
 * Problem: Method Without Parameters but With Return
 *
 * Description:
 * Write a program that demonstrates a method
 * which takes NO input but RETURNS a value.
 *
 * Expected Output:
 * --- Method Type 4 ---
 * Value of Pi = 3.14159
 * Random number = 42
 * Current year = 2025
 *
 * Concepts used: return type, no parameters, return statement
 */

public class MethodType4 {
    
    // Method 1 - returns Pi value
    public static double getPi(){    //Remeber that we have to use Double not int since its in decimal form
        return 3.14159;
    }
    // Method 2 - returns a fixed number
    public static int Random(){
        return 42;
    }
    // Method 3 - returns current year
    public static int currentyear(){
        return 2026;
    }
    
    public static void main(String[] args) {
        
        System.out.println("--- Method Type 4 ---");
        System.out.println("Value of Pi = "+getPi());
        System.out.println("Random Number = "+ Random());
        System.out.println("Current year = "+currentyear());
                
    }
}

/*
 * In This Method Type 4 (No Parameter , with Return)
 * it doesn't take input but displays/returns the default value that has been set in the code 
 */