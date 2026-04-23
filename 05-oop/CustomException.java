/*
 * Problem: Custom Exception and throws/throw keywords
 *
 * Description:
 * Learn how to create custom exceptions
 * and use throws/throw keywords.
 *
 * Expected Output:
 * --- throw keyword ---
 * ERROR: Age cannot be negative!
 *
 * --- Custom Exception ---
 * ERROR: Invalid CGPA: -5.0
 * CGPA must be between 0 and 10!
 *
 * KEY CONCEPTS:
 * - throw = manually throw an exception
 * - throws = declare method might throw exception
 * - Custom Exception = your own exception class
 * - extends Exception = to create custom exception
 *
 * Concepts used: throw, throws, Custom Exception
 */

// Custom Exception class

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
class InvalidCgpaException extends Exception{
    InvalidCgpaException(String message){
        super(message);
    }
}
public class CustomException{
public static void setAge(int age) throws InvalidAgeException{
    if(age<0){
        throw new InvalidAgeException("Age not be negative");
    }
    System.out.println("Age set as : "+age);
}
public static void setCGPA(double CGPA) throws InvalidCgpaException{
    if(CGPA>10||CGPA<0){
        throw new InvalidCgpaException("CGPA should be in between 0 - 10");
        }
    System.out.println("CGPA is set as : "+CGPA);
}

    public static void main(String[] args) {
        System.out.println("--- Throws Keyword ---");
        try{
            setAge(-5);
        }catch(InvalidAgeException e){
            System.out.println("ERROR: "+e.getMessage());
        }
        System.out.println();

        //Custom Exception Demo try
        try{
            setCGPA(-5.0);
        }catch(InvalidCgpaException e){
            System.out.println("ERROR: "+e.getMessage());
        }
        System.out.println();

        //Here we are giving the proper value and checking
        try{
            setAge(19);
            setCGPA(8.5);
        }catch(InvalidAgeException | InvalidCgpaException e){
            System.out.println("ERROR: "+e.getMessage());
        }
        System.out.println();
    }
}