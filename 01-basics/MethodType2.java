/*
 * Problem: Method With Parameters, Without Return
 *
 * Description:
 * Write a program that demonstrates a method
 * which takes INPUT (parameters) but returns NOTHING (void).
 *
 * Expected Output:
 * --- Method Type 2 ---
 * Hello, Jaans Pravin Nadar !
 * You are 19 years old
 * You study at SFIT
 *
 * Concepts used: void method, parameters
 */

public class MethodType2 {
    
    // Method - with parameters, no return (void)
    public static void myinfo(String name, int age, String College){
        System.out.println("Hello, "+name+" !");
        System.out.println("You are "+age+" years old ");
        System.out.println("You study at "+College);
    }
    
    public static void main(String[] args) {
        
        System.out.println("--- Method Type 2 ---");
        
        myinfo("Jaans Pravin Nadar",19,"SFIT");
        
    }
}

/*
 * #NOTE : In the MethodType1.java (no parameters and no return)
 * In this performing same task for a fixed input or ouput 
 */

 /*
  * MethodType2 (parameters and no return)
  In this input is given with expecting anything back 
  */