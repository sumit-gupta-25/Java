// Calculate Average Marks

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = sc.nextDouble();
            sum += marks;
        }

        double average = sum / n;

        System.out.printf("\nAverage of Marks: %.2f%n", average);

        sc.close();
    }
}
