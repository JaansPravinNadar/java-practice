/*
 * Problem: String Comparison - == vs .equals()
 *
 * Description:
 * Understand the difference between == and .equals()
 * This is a VERY common interview question!
 *
 * Expected Output:
 * --- String Comparison ---
 * s1: Hello
 * s2: Hello
 * s3: Hello
 *
 * s1 == s2: true
 * s1 == s3: false
 * s1.equals(s2): true
 * s1.equals(s3): true
 *
 * WHY?
 * == compares memory reference (address)
 * .equals() compares actual content (value)
 *
 * RULE: Always use .equals() for strings!
 *
 * KEY CONCEPTS:
 * 1. String Pool - Shared memory area for string literals (saves memory)
 * 2. Heap Memory - Separate memory for objects created with 'new'
 * 3. == operator - Compares memory addresses (reference comparison)
 * 4. .equals() - Compares actual string content (value comparison)
 *
 * MEMORY VISUALIZATION:
 * String Pool:                    Heap Memory:
 * ┌──────────┐                   ┌──────────┐
 * │ "Hello"  │ ← 0x100           │ "Hello"  │ ← 0x200
 * └──────────┘                   └──────────┘
 *      ↑                              ↑
 *    ┌─┴─┐                            s3
 *   s1   s2
 *
 * Concepts used: String comparison, memory concepts, String Pool
 */

public class StringComparison {
    public static void main(String[] args) {
        
        // String literal - stored in String Pool (shared memory)
        // Java reuses same "Hello" for both s1 and s2 (same address!)
        String s1 = "Hello";
        String s2 = "Hello";  // Points to SAME "Hello" in pool as s1
        
        // Using 'new' keyword - creates NEW object in Heap (separate memory)
        // Even though content is same, it's a different object (different address!)
        String s3 = new String("Hello");
        
        System.out.println("--- String Comparison ---");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println();
        
        // == operator compares ADDRESSES (where in memory)
        System.out.println("s1 == s2: " + (s1 == s2));  // true - same pool address
        System.out.println("s1 == s3: " + (s1 == s3));  // false - pool vs heap
        System.out.println();
        
        // .equals() compares CONTENT (what's inside)
        System.out.println("s1.equals(s2): " + s1.equals(s2));  // true - both "Hello"
        System.out.println("s1.equals(s3): " + s1.equals(s3));  // true - both "Hello"
        System.out.println();
        
        System.out.println("WHY?");
        System.out.println("== compares memory reference (address)");
        System.out.println(".equals() compares actual content (value)");
        System.out.println();
        System.out.println("RULE: Always use .equals() for strings!");
        
        // ANALOGY:
        // String Pool = Library (shared books, same shelf)
        // Heap Memory = Bookstore (buy your own copy, different location)
        if(s1 == s2) {
    System.out.println("\nUsing '==': s1 and s2 have same content AND address");
    System.out.println("Both point to String Pool, so comparison is TRUE");
}

if(s1 == s3) {
    System.out.println("This won't print - different addresses!");
} else {
    System.out.println("\nUsing '==': s1 and s3 have same content but DIFFERENT address");
    System.out.println("s1 in String Pool, s3 in Heap, so comparison is FALSE");
}

if(s1.equals(s3)) {
    System.out.println("\nUsing '.equals()': Compares CONTENT only, not address");
    System.out.println("Both contain 'Hello', so comparison is TRUE");
}
    }
}