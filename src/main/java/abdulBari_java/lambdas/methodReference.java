package abdulBari_java.lambdas;
// in te method reference we can assign ay method with the same parameter to the functional interface

// A functional interface with a single abstract method
@FunctionalInterface
interface MiLambda {
    void display(String s); // Method with a single String parameter and no return type
}

@FunctionalInterface
interface theCheck {
    public int check (String s1 , String s2 ) ;
}

public class methodReference {

    // A static method to reverse a string and print it
    public static void reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }

    // A static method to convert a string to uppercase and print it
    public static void toUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {
        // Using a method reference to System.out.println
        MiLambda lambda = System.out::println;
        lambda.display("Hello, World!");
        // Explanation: System.out::println replaces the display method in the MiLambda interface.
        // When lambda.display("Hello, World!") is called, it invokes System.out.println("Hello, World!").

        // Using a method reference to the reverse method
        MiLambda lambda1 = methodReference::reverse;
        lambda1.display("Hello");
        // Explanation: MethodReference::reverse replaces the display method.
        // When lambda1.display("Hello") is called, it invokes MethodReference.reverse("Hello").

        // Using a method reference to the toUpperCase method
        MiLambda lambda2 = methodReference::toUpperCase;
        lambda2.display("hello");
        // Explanation: MethodReference::toUpperCase replaces the display method.
        // When lambda2.display("hello") is called, it invokes MethodReference.toUpperCase("hello").

        // Demonstrating lambda expressions for comparison
        MiLambda lambda3 = (str ) -> System.out.println("Custom message: " + str);
        lambda3.display("Using a lambda expression!");
        // Explanation: This demonstrates using a lambda expression directly instead of a method reference.


        theCheck ch = String::compareTo;
        System.out.println(ch.check("Hello", "World"));
    }
}
