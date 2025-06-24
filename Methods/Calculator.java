import java.util.Scanner;

public class Calculator {
    // Method to perform calculation for two numbers
    public static double calculator (char op, int num1, int num2) {
        double result = 0;

        if (op == '+') {
            result = num1 + num2;
        }
        else if (op == '-') {
            result = num1 - num2;
        }
        else if (op == '*') {
            result = num1 * num2;
        }
        else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            }
        }
        else {
            result = num1 % num2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter which operation you want to perform (+, -, *, /, %): ");
        char op = sc.next().trim().charAt(0);

        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            double result = calculator(op, num1, num2);

            System.out.println("\n--- Result ---");
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        } 
        else {
            System.out.println("Invalid Operator!");
        }

        sc.close();        
    }
}
