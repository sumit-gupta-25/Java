//Input base and side of parallelogram to find perimeter of a parallelogram

import java.util.Scanner;

public class PerimeterOfParallelogram {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Side of Parallelogram: ");
        double a = sc.nextDouble();
        System.out.print("Enter the Base of Parallelogram: ");
        double b = sc.nextDouble();

        double perimeter = 2 * (a + b);
        System.out.println("Perimeter of Parallelogram: " + perimeter);

        sc.close();
    }
}
