//Input side to find total surface area of a cube

import java.util.Scanner;

public class TotalSurfaceAreaCube {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of a cube: ");
        double side = sc.nextDouble();

        double area = 6 * side * side;

        System.out.println("The Total Surface Area of a Cube is: " + area + " square units");

        sc.close();
    }
}
