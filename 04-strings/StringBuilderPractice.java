/*
 * Problem: StringBuilder Practice
 *
 * Description:
 * Practice using StringBuilder methods to manipulate strings.
 *
 * KEY CONCEPTS:
 * 1. String is IMMUTABLE (cannot be changed)
 *    - Every modification creates a NEW object in memory
 *    - Example: str = str + "x" creates new string object
 *
 * 2. StringBuilder is MUTABLE (can be changed)
 *    - Modifications happen on SAME object
 *    - Much more efficient for multiple operations
 *
 * 3. When to use what:
 *    - String: Simple, one-time concatenation
 *    - StringBuilder: Loops, multiple modifications, reversing
 *
 * PERFORMANCE COMPARISON:
 * String in loop:
 *   for(i=0; i<100; i++) { str = str + i; }  // Creates 100 objects! Slow!
 *
 * StringBuilder in loop:
 *   for(i=0; i<100; i++) { sb.append(i); }   // Uses 1 object! Fast!
 *
 * MEMORY VISUALIZATION:
 * String approach (wasteful):
 *   "a" → "ab" → "abc" → "abcd"  (4 separate objects created)
 *
 * StringBuilder approach (efficient):
 *   "a" → modify → "ab" → modify → "abc" → modify → "abcd"  (1 object reused)
 *
 * ANALOGY:
 * String = Paper (write once, can't erase, need new paper for changes)
 * StringBuilder = Whiteboard (write, erase, modify on same board)
 *
 * Expected Output:
 * --- StringBuilder Practice ---
 * Initial: Hello
 * After append: Hello World
 * After insert: Hello, World
 * After delete: Hello World
 * After replace: Hello Java
 * After reverse: avaJ olleH
 * Final length: 10
 * Character at index 2: a
 * Set character H has J in hello world
 *
 * Concepts used: StringBuilder methods, mutability, performance optimization
 */

public class StringBuilderPractice {
    public static void main(String[] args) {
        
        // StringBuilder is mutable - we can modify same object multiple times
        StringBuilder sb = new StringBuilder("Hello");        
        System.out.println("--- StringBuilder Practice ---");
        System.out.println("Initial: " + sb);

        System.out.println("After Append : "+sb.append(" World"));
        System.out.println("Insert , at Index 5 : "+sb.insert(5, ","));
        System.out.println("Delete , from the index 5 : "+sb.delete(5, 6));
        System.out.println("Replace World with Java : "+sb.replace(6, 11,"Java"));
        System.out.println("Reverse the current String : "+sb.reverse());
        System.out.println("Find the length of the String : "+sb.length());
        System.out.println("Character at index 2 : "+sb.charAt(2));
        System.out.println("Reversing the string to original : "+sb.reverse());
        sb.setCharAt(0, 'J');
        System.out.println(sb);
    }
}