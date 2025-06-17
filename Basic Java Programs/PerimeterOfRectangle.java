//Input length and width of rectangle to find perimeter of a rectangle

import java.util.Scanner;

public class PerimeterOfRectangle {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter the Width of Rectangle: ");
        double w = sc.nextDouble();

        double perimeter = 2 * (l + w);
        System.out.println("Perimeter of Rectangle: " + perimeter);

        sc.close();
    }
}
