/*
 * Problem: Grade Calculator
 *
 * Input:
 * marks = 75
 *
 * Expected Output:
 * Marks : 75
 * Grade : B
 *
 * Logic:
 * 90 and above  → Grade A
 * 75 to 89      → Grade B
 * 60 to 74      → Grade C
 * 50 to 59      → Grade D
 * below 50      → Fail
 *
 * Concepts used: if, else if, else
 */

public class IfElseDemo {
    public static void main(String[] args) {

        int marks =75;
        System.out.println("Marks : "+marks);
        if(marks>=90){
            System.out.println("Grade : A");
        }else if (marks>=75 && marks<=89) {
            System.out.println("Grade : B");
        }else if(marks>=60 && marks<=74){
            System.out.println("Grade : C");
        }else if(marks>=50 && marks<=59){
            System.out.println("Grade : D");
        }else{
        System.out.println("Fail");
        }


    }
}