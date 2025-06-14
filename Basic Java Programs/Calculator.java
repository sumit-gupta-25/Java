//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float result = 0;

//while(true) Here this also can be used to make it perform continuous operations.
        
        System.out.print("Enter the operator: ");
        char op = sc.next().trim().charAt(0);

        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            System.out.println("Enter two numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            if (op == '+') {
                result = num1 + num2;
            }
            if (op == '-') {
                result = num1 - num2;
            }
            if (op == '*') {
                result = num1 * num2;
            }
            if (op == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                }
            }
            if (op == '%') {
                result = num1 % num2;
            }
        }
        else{
            System.out.println("Invalid Operator.");
        }
        System.out.println("Calculated value is " + result);

        sc.close();
    }
}
