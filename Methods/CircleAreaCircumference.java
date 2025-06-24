// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class CircleAreaCircumference {
    public static double circumference(double r) {
        double circumference = 2 * 3.14 * r;
        return circumference;
    }
    public static double area(double r) {
        double area = 3.14 * r * r;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of a circle: ");
        double radius = sc.nextDouble();

        double area = area(radius);
        double circumference = circumference(radius);

        System.out.println("\n--- Result ---");
        System.out.printf("Area of Circle with radius %.2f is: %.2f%n" , radius, area);
        System.out.printf("Circumference of circle with radius %.2f is: %.2f%n" , radius, circumference);

        sc.close();
    }
}
