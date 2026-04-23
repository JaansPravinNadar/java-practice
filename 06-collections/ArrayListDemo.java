/*
 * Problem: ArrayList Basics
 *
 * Description:
 * Learn how to use ArrayList - a dynamic array
 * that can grow and shrink automatically.
 *
 * Expected Output:
 * --- ArrayList Basics ---
 * List: [Java, Python, C++]
 * Size: 3
 * Element at 0: Java
 * After add: [Java, Python, C++, JavaScript]
 * After remove: [Java, C++, JavaScript]
 * Contains Java: true
 * After clear: []
 *
 * KEY CONCEPTS:
 * - ArrayList = dynamic array (grows/shrinks automatically)
 * - add() = add element
 * - remove() = remove element
 * - get() = get element at index
 * - size() = get size
 * - contains() = check if element exists
 * - clear() = remove all elements
 *
 * Concepts used: ArrayList, Collections
 */
import java.util.ArrayList;

public class ArrayListDemo{
    public static void main(String[] args) {

        //Creating a ArrayList
        ArrayList<String> list = new ArrayList<>();
        
        //Now we are adding elements/Strings in the Array
        list.add("Java"); 
        list.add("SpringBoot");
        list.add("Python");
        list.add("Django");

        System.out.println("--- ArrayList Basics ---"); // basics of ArrayList
        System.out.println("List: "+list); //this shows the elements in the array
        System.out.println("Size: "+list.size()); //same has we use .length but this .size() is for ArrayList
        System.out.println("Element at index 0: "+list.get(0)); //Element at index whatever we choice but valid only

        //if we want to add more elements
        list.add("JavaScript");
        System.out.println("Updated List: "+list);

        //If we want to remove a particular element from a particular index
        System.out.println("Removed Element from index 4 is : "+list.remove(4));
        System.out.println("After removing: "+list);

        //clear
        list.clear(); 
        System.out.println("After Clear: "+list); //Empty Array
     }
}