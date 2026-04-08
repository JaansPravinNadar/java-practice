/*
 * Problem: Find Maximum and Minimum in Array
 *
 * Description:
 * Given an array of numbers, find the largest
 * and smallest elements.
 *
 * Input:
 * arr = {45, 23, 78, 12, 67, 34}
 *
 * Expected Output:
 * Array: 45 23 78 12 67 34
 * Maximum element: 78
 * Minimum element: 12
 *
 * Concepts used: arrays, loops, if conditions
 */

public class ArrayMaxMin {
    public static void main(String[] args) {
        
        int[] arr = {45, 23, 78, 12, 67, 34};
        
        // Print array
        System.out.print("Array : ");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " " );
        }
        System.out.println();
        // write your code here to find max and min
        int max =arr[0];
        for (int i=0; i< arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum Element: "+max);

        int min =arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element : "+min);
    }
}
