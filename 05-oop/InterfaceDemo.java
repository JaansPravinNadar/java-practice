/*
 * Problem: Understanding Interface
 *
 * Description:
 * Learn full abstraction using interfaces.
 * A class can implement MULTIPLE interfaces!
 *
 * Expected Output:
 * --- Interface Demo ---
 * Duck is flying!
 * Duck is swimming!
 * Athlete is running
 * KEY CONCEPTS:
 * - Interface = 100% abstraction (all methods are abstract!)
 * - All methods in interface have NO body by default
 * - Class uses 'implements' keyword (not extends!)
 * - A class can implement MULTIPLE interfaces!
 * - Interface = CONTRACT (you MUST do these things!)
 *
 * DIFFERENCE from Abstract Class:
 * Abstract Class = Partial abstraction (some methods have body)
 * Interface      = Full abstraction (NO methods have body)
 *
 * Abstract Class → extends (only ONE parent)
 * Interface      → implements (MULTIPLE interfaces allowed!)
 *
 * ANALOGY:
 * Interface = Job contract
 * "If you want this job, you MUST know Java, DSA, and System Design"
 * Company doesn't care HOW you learned it
 * You just MUST know it!
 *
 * Concepts used: interface, implements, multiple interfaces
 */
interface flyable{
    void fly();
}
interface swimmable{
    void swimming();
}
interface runnable{
    void running();
}
class Duck implements flyable , swimmable{
    public void fly(){
        System.out.println("Duck is flying");
    }
    public void swimming(){
        System.out.println("Duck is swimming");
    }
}
class Athlete implements runnable{
public void running(){
    System.out.println("Athlete is running");
}
}
public class InterfaceDemo {
    public static void main(String[] args) {

        System.out.println("--- Interface Demo ---");
        Duck duck=new Duck();
        duck.fly();
        duck.swimming();
        Athlete athlete = new Athlete();
        athlete.running();
    }
}