//Input radius and calculate the area of circle

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of Circle: ");
        double r = sc.nextDouble();

        double area = 3.14 * (r * r);
        System.out.println("Area of Circle: " + area);

        sc.close();
    }
}
