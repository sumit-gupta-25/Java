//Input side of square to find perimeter of a square

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Side of Square: ");
        double a = sc.nextDouble();

        double perimeter = 4 * a;
        System.out.println("Perimeter of Square: " + perimeter);

        sc.close();
    }
}

//For Rhombus same program can be used as all the sides of rhombus are equal.
