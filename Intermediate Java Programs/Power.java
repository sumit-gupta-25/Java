// Base to the power of x 

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = sc.nextDouble();
        System.out.print("Enter the power: ");
        double power =  sc.nextDouble();

        double result = Math.pow(base, power);
        
        /*
        Another method --- For loop
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        */

        System.out.printf("%.2f to the power of %.2f: %.2f%n", base, power, result);

        sc.close();
    }
}
