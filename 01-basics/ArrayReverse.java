/*
 * Problem: Reverse an Array
 *
 * Description:
 * Reverse the elements of an array in-place (without using extra array).
 *
 * Input:
 * arr = {1, 2, 3, 4, 5}
 *
 * Expected Output:
 * Original Array: 1 2 3 4 5
 * Reversed Array: 5 4 3 2 1
 *
 * Concepts used: arrays, loops, swapping, two-pointer technique
 */

public class ArrayReverse {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        
        // Print original array
        System.out.print("Original Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        
        // code to reverse the array
        int temp =0;
        int start = 0;
        int end =arr.length - 1;
        while(start < end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        // Print reversed array
        System.out.print("Reversed Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}