// Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class ProductOfTwoNumbers {
    // Method to multiply two numbers
    public static int product(int n1, int n2) {
        int product = n1 * n2;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = product(num1, num2);

        System.out.println("Product of " + num1 + " and " + num2 + " is: " + result);

        sc.close();
    }
}
