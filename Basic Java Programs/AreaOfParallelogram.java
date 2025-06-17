//Input base and height of a parallelogram and calculate the area of parallelogram

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of a paralellogram: ");
        double b = sc.nextDouble();
        System.out.print("Enter the height of a parallelogram: ");
        double h = sc.nextDouble();

        double area = b * h;
        System.out.println("Area of Parallelogram: " + area);

        sc.close();
    }
}
