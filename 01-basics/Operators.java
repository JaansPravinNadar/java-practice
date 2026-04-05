public class Operators {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        //Arithmetic Operators
        System.out.println("Addition : "+ (a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modulus: "+(a%b));

        //Relational Operators
        System.out.println("a > b: "+(a>b));
        System.out.println("a < b: "+(a<b));
        System.out.println("a == b : "+(a==b));
        System.out.println("a != b : "+(a!=b));

        //Logical Operators
        System.out.println("AND : "+(a>6 && b>6));
        System.out.println("OR: "+(a>6 || b>6));
        System.out.println("NOT: "+ !(a>6));
    }
}
