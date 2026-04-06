/*
 * Problem: Day of the Week
 *
 * Description:
 * Write a program that prints the day name
 * based on the day number entered.
 *
 * Input:
 * day = 3
 *
 * Expected Output:
 * Day 3 : Wednesday
 *
 * Logic:
 * 1 → Monday
 * 2 → Tuesday
 * 3 → Wednesday
 * 4 → Thursday
 * 5 → Friday
 * 6 → Saturday
 * 7 → Sunday
 * anything else → Invalid day
 *
 * Concepts used: switch, case, break, default
 */

public class SwitchDemo {
    public static void main(String[] args) {
        
        int day =3 ;
        switch (day){
            case 1 : 
            System.out.println("Day 1 : Monday");
            break;
            case 2: 
            System.out.println("Day 2 : Tuesday");
            break;
            case 3:
            System.out.println("Day 3 : Wednesday");
            break;
            case 4:
            System.out.println("Day 4 : Thursday");
            break;
            case 5:
            System.out.println("Day 5 : Friday");
            break;
            case 6:
            System.out.println("Day 6 : Saturday");
            break;
            case 7:
            System.out.println("Day 7 : Sunday");
            break;
            default:
            System.out.println("Invalid Entry");
            break;
        }
    }
}
