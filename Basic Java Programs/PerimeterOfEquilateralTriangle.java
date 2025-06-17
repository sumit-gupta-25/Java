//Input side of triangle to find perimeter of a equilateral triangle

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of Equilateral Triangle: ");
        double a = sc.nextDouble();

        double perimeter = 3 * a;
        System.out.println("Perimeter of Equilateral Triangle: " + perimeter);

        sc.close();
    }
}
