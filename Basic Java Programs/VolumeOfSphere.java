//Input radius to find volume of a sphere

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double r = sc.nextDouble();

        double volume = (4 * 3.14 * r * r * r)/ 3;

        System.out.println("The volume of the sphere is: " + volume + " cubic units");

        sc.close();
    }    
}
