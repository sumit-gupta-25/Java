//Input radius and height to find curved surface area of a cylinder

import java.util.Scanner;

public class CurvedSurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of base of the cylinder: ");
        double r = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double h = sc.nextDouble();

        double area = 2 * 3.14 * r * h;

        System.out.println("The Curved Surface Area of Cylinder is: " + area + " square units");

        sc.close();
    }
}
