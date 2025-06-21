// Input a set of numbers and print the average of that numbers.

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to average: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = sc.nextDouble();
            sum += num;
        }

        double average = sum / n;
        System.out.printf("Average of %d numbers: %.2f%n", n, average);

        sc.close();
    }
}
