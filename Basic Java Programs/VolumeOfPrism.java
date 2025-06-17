//Input base area and height to find volume of a prism

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base area of the prism: ");
        double baseArea = sc.nextDouble();
        System.out.print("Enter the height of the prism: ");
        double height = sc.nextDouble();

        double volume = baseArea * height;

        System.out.println("The volume of the prism is: " + volume + " cubic units");

        sc.close();
    }
}
