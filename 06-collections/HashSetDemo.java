/*
 * Problem: HashSet Basics
 *
 * Description:
 * Learn how to use HashSet - stores only
 * unique elements, no duplicates allowed!
 *
 * Expected Output:
 * --- HashSet Basics ---
 * Set: [Java, Python, C++]
 * Size: 3
 * Contains Java: true
 * After adding duplicate: [Java, Python, C++]
 * After remove: [Java, C++]
 *
 * --- Real Use Case ---
 * Array: [1, 2, 2, 3, 3, 3, 4]
 * Unique elements: [1, 2, 3, 4]
 *
 * KEY CONCEPTS:
 * - HashSet = stores only unique values
 * - Duplicate add() is simply IGNORED
 * - No index (can't use get()!)
 * - add() = add element
 * - remove() = remove element
 * - contains() = check if exists
 * - size() = number of elements
 *
 * ANALOGY:
 * HashSet = Attendance register
 * Each student name appears ONCE only!
 * If same name added twice, ignored!
 *
 * Concepts used: HashSet, Collections
 */
import java.util.ArrayList;
import java.util.HashSet;
public class HashSetDemo{
    public static void main(String[] args) {
        //create HashSet
        HashSet <String> set=new HashSet<>();

        //add()
        set.add("Java");
        set.add("Python");
        set.add("C++");

        System.out.println("--- HashSet Basics ---");
        System.out.println("Set: "+set); //Such has HashMap HashSet also doesn't maintain a proper order
        System.out.println("Size: "+set.size());
        System.out.println("Set Contains Java : "+set.contains("Java"));

        //Let's Try to add a duplicate
        set.add("Java"); //THIS WOULD BE IGNORED
        System.out.println("After trying to add a Duplicate: "+set);

        //Using remove()
        set.remove("C++");
        System.out.println("After Removal of 'C++': "+set);

        //Real Use Case of HashSet
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println("Array: "+list);

        //Now convert it into HashSet removing the Duplicates
        HashSet <Integer> uniquSet = new HashSet<>(list);
        System.out.println("Unique Set: "+uniquSet);


    }
}