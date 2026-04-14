/*
 * Problem: Check if Two Strings are Anagrams
 *
 * Description:
 * Two strings are anagrams if they contain the same characters
 * in the same frequency, but possibly in different order.
 *
 * Examples:
 * "listen" and "silent" → Anagram ✅
 * "triangle" and "integral" → Anagram ✅
 * "hello" and "world" → Not Anagram ❌
 *
 * Input: "listen", "silent"
 * Output: true
 *
 * Input: "hello", "world"
 * Output: false
 *
 * Expected Output:
 * --- Check Anagram ---
 * "listen" and "silent": true
 * "triangle" and "integral": true
 * "hello" and "world": false
 * "java" and "avaj": true
 *
 * Concepts used: Arrays.sort(), String.toCharArray(), Arrays.equals()
 */

import java.util.Arrays;
public class CheckAnagram {
    public static boolean checkAnagram(String str1, String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }
        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1); //to put all the char in the ascending order {a,b,c,.........}
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        System.out.println("--- Check Anagram ---");
        System.out.println("listen and silent : "+checkAnagram("listen","silent"));
        System.out.println("hello and World : "+checkAnagram("hello", "World"));
        System.out.println("Triangle and integral : "+checkAnagram("Triangle", "integral"));
        System.out.println("Java and avaj : "+checkAnagram("Java", "avaj"));
    }
}
