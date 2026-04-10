/*
 * Problem: Find Second Largest Element in Array
 *
 * Description:
 * Find the second largest element in an array.
 * If second largest doesn't exist, return -1.
 *
 * Input:
 * arr = {12, 35, 1, 10, 34, 1}
 *
 * Expected Output:
 * Array: 12 35 1 10 34 1
 * Largest: 35
 * Second Largest: 34
 *
 * Input:
 * arr = {10, 10, 10}
 *
 * Expected Output:
 * Array: 10 10 10
 * Second Largest: -1 (all elements are same)
 *
 * Concepts used: arrays, loops, conditional logic
 */

public class SecondLargest {
    public static void main(String[] args) {
         // Test case 1
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.print("Array: ");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        
        // Code to find second largest
        int largest =-1 ;
        int secondlargest = -1;

        for(int i=0;i<arr1.length; i++){
            if(arr1[i]>largest){
                secondlargest=largest;
                largest=arr1[i];
            }else if( arr1[i] >secondlargest && arr1[i] != largest){
                secondlargest=arr1[i];
            }
            }
            System.out.println("Largest: "+largest);
            System.out.println("Second Largest: "+secondlargest);
        
        
        System.out.println();
        
        // Test case 2
        int[] arr2 = {10, 10, 10};
        System.out.print("Array2: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        
        // write your code here to find second largest
        int largest2 = -1;
        int secondlargest2 = -1;
        for(int i=0;i<arr2.length; i++){
            if(arr2[i]>largest2){
                secondlargest2=largest2;
                largest2=arr2[i];
            }else if( arr2[i] >secondlargest2 && arr2[i] != largest2){
                secondlargest2=arr2[i];
            }
            }
            System.out.println("Largest2: "+largest2);
            System.out.println("Second Largest2: "+secondlargest2);
        }
}