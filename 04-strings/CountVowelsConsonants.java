/*
 * Problem: Count Vowels and Consonants in a String
 *
 * Description:
 * Count how many vowels and consonants are in a string.
 * Vowels: a, e, i, o, u (case-insensitive)
 * Ignore spaces, digits, and special characters.
 *
 * Input: "Hello World"
 * Output: 
 * Vowels: 3 (e, o, o)
 * Consonants: 7 (H, l, l, W, r, l, d)
 *
 * Expected Output:
 * --- Count Vowels and Consonants ---
 * String: Hello World
 * Vowels: 3
 * Consonants: 7
 *
 * String: Java Programming 123
 * Vowels: 5
 * Consonants: 11
 *
 * String: aeiouAEIOU
 * Vowels: 10
 * Consonants: 0
 *
 * Concepts used: Character.isLetter(), loops, conditionals
 */

public class CountVowelsConsonants {
    
    public static void countVowelsConsonants(String str) {
        str = str.toLowerCase();
        
        int vowels = 0;
        int consonants = 0;
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' ||ch == 'i' || ch ==  'o' || ch == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }

        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    
    public static void main(String[] args) {
        
        System.out.println("--- Count Vowels and Consonants ---");
        
        System.out.println("String: Hello World");
        countVowelsConsonants("Hello World");
        System.out.println();
        
        System.out.println("String: Java Programming 123");
        countVowelsConsonants("Java Programming 123");
        System.out.println();
        
        System.out.println("String: aeiouAEIOU");
        countVowelsConsonants("aeiouAEIOU");
    }
}