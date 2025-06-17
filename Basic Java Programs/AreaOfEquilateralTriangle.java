//Input side of a equilateral triangle and calculate the area of equilateral triangle

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of a equilateral triangle: ");
        double a = sc.nextDouble();

        double area = 0.43301270189 * a;  //value of root(3)/4 is used here.
        System.out.println("Area of Equilateral Triangle: " + area);

        sc.close();
    }
}
