/*
 * Problem: Method With Parameters and Return
 *
 * Description:
 * Write a program that demonstrates a method
 * which takes INPUT (parameters) and RETURNS a result.
 *
 * Expected Output:
 * --- Method Type 3 ---
 * Sum of 10 and 20 = 30
 * Product of 5 and 6 = 30
 * Max of 15 and 25 = 25
 *
 * Concepts used: return type, parameters, return statement
 */

public class MethodType3 {
    
    // Method 1 - returns sum of two numbers
    public static int sum(int a , int b){
        return a+b;
    }
    
    // Method 2 - returns product of two numbers
    public static int product(int a , int b){
        return a*b;
    }
    
    // Method 3 - returns maximum of two numbers
    public static int  max(int a , int b ){
        if(a<b){
            return b;
        }else{
            return a;
        }
    }
    public static void main(String[] args) {
        
        System.out.println("--- Method Type 3 ---");
        sum(10,20);
        System.out.println("Sum of 10 and 20 = " + sum(10,20) );

        product(5, 6);
        int pro = product(5, 6);
        System.out.println("Product of 5 and 6 = "+pro);

        max(15,25);
        System.out.println("Max of 15 and 25 = "+max(15,25));
        
    }
}
/*
 * In this Method Type 3 (With Parameters and Return)
 * we will give input and it will give output by calculating 
 */