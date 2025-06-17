//Input radius and height to find volume of a cylinder

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of base of the cylinder: ");
        double r = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double h = sc.nextDouble();

        double volume = 3.14 * r * r * h;

        System.out.println("The volume of the cylinder is: " + volume + " cubic units");

        sc.close();
    }
}
