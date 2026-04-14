/*
 * Problem: Reverse Words in a String
 *
 * Description:
 * Reverse the order of words in a string.
 * Example: "Hello World" → "World Hello"
 *
 * Input: "Java is fun"
 * Output: "fun is Java"
 *
 * Input: "I love programming"
 * Output: "programming love I"
 *
 * Expected Output:
 * --- Reverse Words in String ---
 * Original: Java is fun
 * Reversed: fun is Java
 *
 * Original: I love programming
 * Reversed: programming love I
 *
 * Original: Hello World
 * Reversed: World Hello
 *
 * Concepts used: String.split(), arrays, loops, String.join()
 */

public class ReverseWords {
    
    public static String reverseWords(String str) {
        // Step 1: Split string into words (creates array)
        String [] words = str.split(" "); //this spilts the string into array of words words[0]=Hello , words[1]= World
        
        // Step 2: Reverse the array using two pointers
        int start = 0;
        int end = words.length-1;
        while(start < end){
            String temp = words[start];
            words[start]=words[end];
            words[end]=temp;
            start++;
            end--;
        }
        // Step 3: Join words back into string
        return String.join(" ",words);  //this line is for joining the words at final 
     }
    
    public static void main(String[] args) {
        
        System.out.println("--- Reverse Words in String ---");
        
        String s1 = "Java is fun";
        System.out.println("Original: " + s1);
        System.out.println("Reversed: " + reverseWords(s1));
        System.out.println();
        
        String s2 = "I love programming";
        System.out.println("Original: " + s2);
        System.out.println("Reversed: " + reverseWords(s2));
        System.out.println();
        
        String s3 = "Hello World";
        System.out.println("Original: " + s3);
        System.out.println("Reversed: " + reverseWords(s3));
    }
}