//Input radius to find perimeter of a circle

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of Circle: ");
        double r = sc.nextDouble();

        double perimeter = 2 * 3.14 * r;
        System.out.println("Perimeter of Circle: " + perimeter);

        sc.close();
    }
}
