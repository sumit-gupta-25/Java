//Calculate CGPA 

import java.util.Scanner;

public class CgpaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Percentage: ");
        double percentage = sc.nextDouble();

        double cgpa = (percentage - 12) / 7.385;

        System.out.printf("CGPA: %.2f%n", cgpa);

        sc.close();
    }
}
