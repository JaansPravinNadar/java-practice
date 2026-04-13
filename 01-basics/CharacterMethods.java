/*
 * Problem: Character Methods Demo
 *
 * Description:
 * Learn important Character class methods for checking
 * and manipulating individual characters.
 *
 * Expected Output:
 * --- Character Checking Methods ---
 * Character: A
 * isLetter: true
 * isDigit: false
 * isUpperCase: true
 * isLowerCase: false
 * isWhitespace: false
 *
 * Character: 5
 * isLetter: false
 * isDigit: true
 *
 * Character:  
 * isWhitespace: true
 * isLetter: false
 *
 * --- Character Conversion ---
 * Uppercase 'a': A
 * Lowercase 'Z': z
 *
 * Concepts used: Character class methods
 */

public class CharacterMethods {
    public static void main(String[] args) {
        
        System.out.println("--- Character Checking Methods ---");
        
        // Check letter
        char ch1 = 'A';
        System.out.println("Character : "+ch1);
        System.out.println("isLetter : "+Character.isLetter(ch1)); /*why we are using Character.isLetter here the Character 
        specifies the class like let me explain u like this : Character <-  is the name of the toolbox and  .isLetter <- is the
        specific tool from the Character toolbox , it goes like this "give me the .isLetter() tool from the Character Toolbox" */
        System.out.println("isDigit : "+Character.isDigit(ch1));
        System.out.println("isUpperCase : "+Character.isUpperCase(ch1));
        System.out.println("isLowerCase : "+Character.isLowerCase(ch1));
        System.out.println("isWhitespace : "+Character.isWhitespace(ch1));
        System.out.println();

        // Check digit
        char ch2 = '5';
        System.out.println("Character : "+ch2);
        System.out.println("isLetter : "+Character.isLetter(ch2));
        System.out.println("isDigit : "+Character.isDigit(ch2));
        System.out.println();
        
        // Check whitespace
        char ch3 = ' ';
       System.out.println("Character : "+ch3);
       System.out.println("isWhitespace : "+Character.isWhitespace(ch3));
       System.out.println("isLetter : "+Character.isLetter(ch3));
       System.out.println(); 
        // Character conversion
        System.out.println("--- Character Conversion ---");
        System.out.println("Uppercase 'a' : "+Character.toUpperCase('a'));
        System.out.println("Lowercase 'Z' : "+Character.toLowerCase('Z'));
        
    }
}