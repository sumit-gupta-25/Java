//Input length and width of a rectangle and calculate the area of rectangle

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of a rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter the width of a rectangle: ");
        double w = sc.nextDouble();

        double area = l * w;
        System.out.println("Area of Rectangle: " + area);

        sc.close();
    }
}
