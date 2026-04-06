/*
 * Problem: Number Patterns using Loops
 *
 * Description:
 * Write a program that demonstrates all 3 loops
 * by printing numbers 1 to 5
 *
 * Expected Output:
 * --- For Loop ---
 * 1 2 3 4 5
 *
 * --- While Loop ---
 * 1 2 3 4 5
 *
 * --- Do While Loop ---
 * 1 2 3 4 5
 *
 * Concepts used: for, while, do-while
 */

public class LoopsDemo {
    public static void main(String[] args) {
        
        System.out.println("------USING FOR LOOP------");
       for (int i= 1; i<=5; i++){
       System.out.print(i +" ");
       }

       System.out.println();

       System.out.println("------USING WHILE LOOP------");

         int n = 1;
        while (n<=5){
            System.out.print(n +" ");
            n++;
        }
            
        System.out.println();

        System.out.println("-------USING DO WHILE LOOP------");
            int m=1;
            do {
                System.out.print( m +" ");
                m++;
            }while(m<=5);


    }
}