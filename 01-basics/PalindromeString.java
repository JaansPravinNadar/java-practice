/*
 * Problem: Check if String is Palindrome
 *
 * Description:
 * A palindrome reads the same forward and backward.
 * Examples: "madam", "racecar", "noon"
 *
 * Input: "madam"
 * Output: true (reads same both ways)
 *
 * Input: "hello"  
 * Output: false (doesn't read same backward)
 *
 * Expected Output:
 * madam: true
 * hello: false
 * racecar: true
 * Racecar: true (case-insensitive)
 * A man a plan a canal Panama: true (ignoring spaces)
 *
 * Concepts used: Two pointers, charAt(), toLowerCase()
 */
public class PalindromeString{

    public static boolean simplepalindrome(String str){
        str =str.toLowerCase();

        int start = 0;
        int end = str.length()-1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    } 

    public static boolean advancedpalindrome(String str){
        str=str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            while(start < end && !Character.isLetter(str.charAt(start))){
                start++;
            }
            while(start < end && !Character.isLetter(str.charAt(end))){
                end--;
            }
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println("--- Simple Palindrome ---");
        System.out.println("madam : "+simplepalindrome("madam"));
        System.out.println("hello : "+simplepalindrome("hello"));
        System.out.println();

        System.out.println("--- Advnaced Palindrome (Ignoring Space) ---");
        System.out.println("madam : "+advancedpalindrome("madam"));
        System.out.println("hello : "+advancedpalindrome("hello"));
        System.out.println("racecar : "+advancedpalindrome("racecar"));
        System.out.println("RaceCar : "+advancedpalindrome("RaceCar"));
        System.out.println("A man a plan a canal Panama : "+advancedpalindrome("A man a plan a canal Panama"));
    }
}
