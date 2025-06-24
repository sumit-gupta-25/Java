//Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class SumOfTwoNumbers {
    // Method to add two numbers
    public static int add(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = add(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close();
    }
}
