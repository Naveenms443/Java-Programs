import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = sc.next(); // Taking operator as a String

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        switch (operator) {
            case "+": System.out.println("Result: " + (num1 + num2)); break;
            case "-": System.out.println("Result: " + (num1 - num2)); break;
            case "*": System.out.println("Result: " + (num1 * num2)); break;
            case "/": 
                if (num2 == 0) System.out.println("Error! Division by zero.");
                else {
                    System.out.println("Quotient: " + (num1 / num2));
                    System.out.println("Remainder: " + (num1 % num2));
                }
                break;
            default: System.out.println("Invalid operator!");
        }
    }
}
