// Calculator Program using Switch case

import java.util.Scanner;

public class CalculatorSwitchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Choose operation (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition of first and second number: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction of second number from first number: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication of first and second number: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division of first number from second number: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            case '%':
                result = num1 % num2;
                System.out.println("Modulo of first number from second number: " + result);
                break;
            default:
                System.out.println("Invalid operator.");
        }

        sc.close(); 
    }
}
