//Input both the diagonals of a rhombus and calculate the area of rhombus

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first diagonal of a rhombus: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter the second diagonal of a rhombus: ");
        double d2 = sc.nextDouble();

        double area = (d1 * d2)/2;
        System.out.println("Area of Rhombus: " + area);

        sc.close();
    }
}
