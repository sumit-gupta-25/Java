//Input base and height and calculate the area of triangle

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of a triangle: ");
        double h = sc.nextDouble();
        System.out.print("Enter the base of a triangle: ");
        double b = sc.nextDouble();

        double area = 0.5 * b * h;
        System.out.println("Area of Triangle: " + area);

        sc.close();
    }
}
