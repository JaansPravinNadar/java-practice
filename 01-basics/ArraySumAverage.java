/*
 * Problem: Sum and Average of Array Elements
 *
 * Description:
 * Calculate the sum and average of all elements in an array.
 *
 * Input:
 * arr = {10, 20, 30, 40, 50}
 *
 * Expected Output:
 * Array: 10 20 30 40 50
 * Sum: 150
 * Average: 30.0
 *
 * Concepts used: arrays, loops, arithmetic operations
 */

public class ArraySumAverage {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};
        
        // Print array
        System.out.print( "Array: ");
        for(int i= 0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Code to find sum and average
        int sum =0;
        for(int i =0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum: "+sum);

        double average =0 ;
            average = (double)sum/arr.length;
        
        System.out.println("Average: "+average);
    }
}