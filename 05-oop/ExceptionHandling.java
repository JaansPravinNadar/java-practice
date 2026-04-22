/*
 * Problem: Exception Handling in Java
 *
 * Description:
 * Learn how to handle runtime errors gracefully
 * using try, catch, finally blocks.
 *
 * Expected Output:
 * --- Arithmetic Exception ---
 * ERROR: Cannot divide by zero!
 * Finally always runs!
 * Program continues after exception!
 *
 * --- Array Exception ---
 * ERROR: Array index out of bounds!
 * Valid access: 30
 *
 * --- Number Format Exception ---
 * ERROR: Invalid number format!
 * Valid conversion: 123
 *
 * --- Multiple Catch ---
 * ERROR: Cannot divide by zero!
 *
 * KEY CONCEPTS:
 * - Exception = unexpected event that disrupts program
 * - try = code that might throw exception
 * - catch = handles the exception
 * - finally = always runs (cleanup code)
 * - e.getMessage() = get error message
 * - Multiple catch blocks = handle different exceptions
 *
 * ANALOGY:
 * try     = Try to cross the road
 * catch   = If car comes, jump back!
 * finally = Always look both ways!
 *
 * Concepts used: try, catch, finally, Exception types
 */

public class ExceptionHandling {
    public static void main(String[] args) {

        // ===== 1. Arithmetic Exception =====
        System.out.println("--- Arithmetic Exception ---");
        try{
            int result=10/0; //trying a exception
            System.out.println("Result: "+result);
        }catch(ArithmeticException e){
            System.out.println("ERROR: Cannot divide by zero");
        }finally{
            System.out.println("Finally always runs");
        }
        System.out.println("Programs continous even after the exception");

         // ===== 2. Array Index Out of Bounds =====
        System.out.println("--- Array Exception ---");
        int arr[]={2,3,5};
        try{
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR: Array Index Out of Bound");
        }
        System.out.println("Valid Length of is Till: "+(arr.length-1)+" Only");

         // ===== 3. Number Format Exception =====
        System.out.println("--- Number Format Exception ---");
        try{
            Integer.parseInt("abc");
        }catch(NumberFormatException e){
            System.out.println("ERROR: Invalid number format");
        }

        // ===== 4. Multiple Catch Blocks =====
        System.out.println("--- Multiple Catch ---");
        try{
            int res=10/0;
            System.out.println("Result is : "+res);
            int ar []={1,65,5}; //          Never Reaches here so it's Exception is called
            System.out.println("ARRAY: "+ar[12]);
        }catch(ArithmeticException e){
            System.out.println("ERROR: Can't divide by zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR: Array Index out of Bounds");
        }
    }
}