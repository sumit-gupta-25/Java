// Write a function to check if a given triplet is a Pythagorean triplet or not. 
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;

public class PythagoreanTriplets {
    // Method to check if a given triplet is a Pythagorean triplet or not.
    public static boolean isPythagoreanTriplet (int n1, int n2, int n3) {
        int x = Math.max(n1, Math.max(n2, n3));
        int y, z;

        if (x == n1) {
            y = n2;
            z = n3;
        } 
        else if (x == n2) {
            y = n1;
            z = n3;
        } else {
            y = n1;
            z = n2;
        }

        return x * x == y * y + z * z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        if (isPythagoreanTriplet(num1, num2, num3)) {
            System.out.println(num1 + ", " + num2 + ", " + num3 + " form a pythagorean triplet.");
        } else {
            System.out.println(num1 + ", " + num2 + ", " + num3 + " do not form a pythagorean triplet.");
        }

        sc.close();
    }
}
