//Input base area and height to find volume of a pyramid

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base area of the pyramid: ");
        double baseArea = sc.nextDouble();
        System.out.print("Enter the height of the pyramid: ");
        double height = sc.nextDouble();

        double volume = (baseArea * height)/3;

        System.out.println("The volume of the pyramid is: " + volume + " cubic units");

        sc.close();
    }
}
