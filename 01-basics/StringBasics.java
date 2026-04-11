/*
 * Problem: String Basics Demo
 *
 * Description:
 * Demonstrate string declaration, initialization,
 * and important string methods.
 *
 * Expected Output:
 * --- String Declaration ---
 * Name: Jaans Pravin Nadar
 * Length: 19
 *
 * --- String Methods ---
 * Uppercase: JAANS PRAVIN NADAR
 * Lowercase: jaans pravin nadar
 * Character at index 0: J
 * Character at index 6: P
 * Substring (0,5): Jaans
 * Substring (6,12): Pravin
 *
 * --- String Search ---
 * Contains 'Pravin': true
 * Starts with 'Jaans': true
 * Ends with 'Nadar': true
 * Index of 'Pravin': 6
 *
 * --- String Modify ---
 * Replace 'Jaans' with 'John': John Pravin Nadar
 * Trim: Hello World
 *
 * Concepts used: String methods
 */

public class StringBasics {
    public static void main(String[] args) {
        
        String name = "Jaans Pravin Nadar";
        String S1 = " Hello World ";
        
        // --- String Declaration ---
        System.out.println("--- String Declaration ---");
        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        
        System.out.println();
        
        // --- String Methods ---
        System.out.println("--- String Methods ---");
        
        System.out.println("Upper Case : "+name.toUpperCase()); // To make the string in uppercase
        System.out.println("Lower Case : "+name.toLowerCase()); // To make the string in lowercase
        System.out.println("Character at index 0 : "+name.charAt(0)); //To find the char at index 0
        System.out.println("Character at index 6 : "+name.charAt(6));
        System.out.println("Substring (0,5) : "+name.substring(0,5));
        System.out.println("Substring (6,12) : "+name.substring(6,12));

        System.out.println("--- String Search ---");
        System.out.println("Contains Pravin : "+ name.contains("Pravin"));
        System.out.println("Starts with Jaans : "+name.startsWith("Jaans"));
        System.out.println("Ends with Nadar : "+name.endsWith("Nadar"));
        System.out.println("Index of Pravin : "+name.indexOf("Pravin"));

        System.out.println("--- String Modify ---");
        System.out.println("Replace Jaans with John : "+name.replace("Jaans","John"));
        System.out.println("Trim : "+S1.trim());
    }
}
