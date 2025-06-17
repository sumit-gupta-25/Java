//Input radius of base and height of cone to find volume of a cone

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of base of cone: ");
        double r = sc.nextDouble();
        System.out.print("Enter the height of cone: ");
        double h = sc.nextDouble();

        double volume = (3.14 * r * r * h)/3;
        System.out.println("Volume of Cone: " + volume + " cubic units");

        sc.close();
    }
}
