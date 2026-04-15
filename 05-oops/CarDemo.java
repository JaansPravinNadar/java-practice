/*
 * Problem: Car Information System
 *
 * Description:
 * Create a Car class to store and display car information.
 * Practice creating objects and using instance variables and methods.
 *
 * Expected Output:
 * --- Car Details ---
 * Brand: Toyota
 * Model: Camry
 * Price: 2500000.0
 * Color: White
 *
 * Brand: Honda
 * Model: City
 * Price: 1200000.0
 * Color: Blue
 *
 * --- Car Actions ---
 * Toyota Camry engine started! 🚗
 * Honda City engine started! 🚗
 *
 * KEY CONCEPTS:
 * - Class = Blueprint (like a car design document)
 * - Object = Actual car built from that design
 * - Instance Variables = Properties every car has (brand, model, price, color)
 * - Methods = Actions a car can perform (startEngine, displayDetails)
 * - Each object has its OWN data (car1 is Toyota, car2 is Honda)
 *
 * ANALOGY:
 * Class = Car factory blueprint
 * Object = Actual car manufactured from that blueprint
 * Each car has different color, model, price but same structure!
 *
 * Concepts used: Classes, Objects, Instance Variables, Methods
 */

class Car{
    String Brand,model,color;
    double price;

    public void carDetails(){
        System.out.println("Brand : "+Brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
        System.out.println("Color : "+color);
        System.out.println();
    }

    public void startEngine(){
        System.out.println(Brand+ " " +model+ " engine started! ");
    }
}
public class CarDemo {
    public static void main(String[] args) {
        System.out.println("--- Car Details ---");
        
        Car car1 = new Car();
        car1.Brand="Toyota";
        car1.model="Camry";
        car1.price=2500000;
        car1.color="White";

        Car car2= new Car();
        car2.Brand="Honda";
        car2.model="City";
        car2.price=1200000;
        car2.color="Blue";

        car1.carDetails();
        car2.carDetails();
        
        System.out.println("--- Car Actions ---");
        car1.startEngine();
        car2.startEngine();    
    }
}