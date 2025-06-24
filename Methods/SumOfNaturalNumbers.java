// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class SumOfNaturalNumbers {
    // Method that returns the sum of first n natural numbers.
    public static int naturalNumber (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = naturalNumber(n);

        System.out.println("Sum of first " + n + " numbers is: " + sum);

        sc.close();
    }
}
