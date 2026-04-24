/*
 * Problem: Count Character Frequency in a String
 *
 * Description:
 * Given a string, count how many times each character appears
 * using HashMap. Also find unique characters using HashSet.
 *
 * Input: "hello world"
 *
 * Expected Output:
 * --- Character Frequency ---
 * String: hello world
 * Frequency:
 * h → 1
 * e → 1
 * l → 3
 * o → 2
 *   → 1
 * w → 1
 * r → 1
 * d → 1
 *
 * Total characters: 11
 * Unique characters: [h, e, l, o,  , w, r, d]
 * Unique count: 8
 *
 * KEY CONCEPTS:
 * - HashMap to count frequency of each character
 * - HashSet to find unique characters
 * - charAt() to get each character from string
 * - containsKey() to check if key already exists
 *
 * Concepts used: HashMap, HashSet, String, Loops
 */
import java.util.*; //this will import all the collections at once
public class CharacterFrequency{
    public static void main(String[] args) {
        String str="hello world";
        System.out.println("--- Character Frequency ---");
        System.out.println("String: "+str);

        HashMap <Character,Integer> freq=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(freq.containsKey(ch)){
                freq.put(ch,freq.get(ch)+1);
            }else{
                freq.put(ch,1);
            }
        }
        System.out.println("Frequency: ");
        for(Character key: freq.keySet() ){
            System.out.println(key+" -> "+freq.get(key));
        }
        System.out.println("Total Characters: "+str.length());

        HashSet<Character> unique =new HashSet<>();
        for(int i=0;i<str.length();i++){
            unique.add(str.charAt(i));
        }
        System.out.println("Unique Character: "+unique);
        System.out.println("Unique Count: "+unique.size());
    }
}
