/*
 * Problem: Array Basics Demo
 *
 * Description:
 * Demonstrate array declaration, initialization,
 * and accessing elements.
 *
 * Expected Output:
 * --- Array Declaration ---
 * Element at index 0: 10
 * Element at index 1: 20
 * Element at index 2: 30
 * Element at index 3: 40
 * Element at index 4: 50
 *
 * Array length: 5
 *
 * --- Printing All Elements ---
 * Element at Index 0 : 10
 * Element at Index 1 : 20
 * Element at Index 2 : 30
 * Element at Index 3 : 40
 * Element at Index 4 : 50
 *
 * Concepts used: arrays, indexing, loops
 */

 /*
  * Array is a object container that can hold a fixed number of value
  * of single data type
  it's index starts from 0
  once created it's size cannot be changed

  it is used to store input 
  managing a big list of data of same type
  */
public class ArrayBasics {
    public static void main(String[] args) {
        
        System.out.println("--- Array Declaration ---");
        
        // Method 1: Declare and initialize separately
       int [] numbers = new int [5];
       numbers [0]=10; //initializing values separately one by one
       numbers [1]=20;
       numbers [2]=30;
       numbers [3]=40;
       numbers [4]=50;
        // Accessing elements
       System.out.println("Element in the Index 0: "+numbers[0]);
       System.out.println("Element in the Index 1: "+numbers[1]);
       System.out.println("Element in the Index 2: "+numbers[2]);
       System.out.println("Element in the Index 3: "+numbers[3]);
       System.out.println("Element in the Index 4: "+numbers[4]);

        // Array length
        System.out.println("Length of the Array : " +numbers.length); // .length to find the length of the array
        // Method 2: Declare and initialize together

        System.out.println("\n--- Printing All Elements ---");
        
        // Code to print all elements using a loop
        for(int i=0; i<numbers.length; i++){
            System.out.println("Element at Index "+i+" : "+numbers[i]);
        }
    }
}