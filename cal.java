import java.util.Scanner;
import

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("=== Java Calculator ===");
        
        // Take first number input
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        // Take operator input (+, -, *, /)
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        // Take second number input
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        boolean validOperation = true;

        // Perform calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                    result = 0;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                validOperation = false;
                result = 0;
                break;
        }

        // Print the result if the operation was valid
        if (validOperation) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }

        scanner.close();
    }
}
