/*
 * Problem: Reverse a String
 *
 * Description:
 * Reverse a string using two different methods:
 * 1. Using StringBuilder (easy, built-in)
 * 2. Manual reversal using two pointers (interview approach)
 *
 * Input: "Hello"
 *
 * Expected Output:
 * Original: Hello
 * Reversed (StringBuilder): olleH
 * Reversed (Manual): olleH
 *
 * Concepts used: StringBuilder, two-pointer technique, char array
 */

public class ReverseString {
    
    // Method 1: Using StringBuilder (easy way)
   public static String reverseStringBuilder(String str){
    StringBuilder string = new StringBuilder(str);
    string.reverse();
    return string.toString(); //here the .toString is to convert the StringBuilder to String
   }
    
    // Method 2: Manual reversal using two pointers
    public static String reverseStringmanually(String str){
        char [] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return new String(arr); //new String(arr) makes the char into String
    }
        
        // write your two-pointer code here
        
        // Convert back to string
    
    
    public static void main(String[] args) {
        
        String str = "Hello";
        System.out.println("Reverse of String using StringBuilder : "+reverseStringBuilder(str));
        System.out.println("Reversed the String Manually : "+reverseStringmanually(str));

    }
}