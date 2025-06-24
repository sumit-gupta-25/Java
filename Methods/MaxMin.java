// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class MaxMin {
    // Method to print the maximum number among three numbers.
    public static int max(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    // Method to print the minimum number among three numbers.
    public static int min(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int maximum = max(num1, num2, num3);
        int minimum = min(num1, num2, num3);

        System.out.println("The maximum number among the entered three numbers is: " + maximum);
        System.out.println("The minimum number among the entered three numbers is: " + minimum);

        sc.close();
    }
}