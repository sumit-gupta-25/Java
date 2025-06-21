// Calculate Commission Percentage

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount of total sales: ");
        double sales = sc.nextDouble();
        System.out.print("Enter amount of Commission earned: ");
        double commission = sc.nextDouble();

        double percent = (sales / commission) * 100;

        System.out.printf("Commisson Percentage: %.2f%%%n ", percent);

        sc.close();
    }
}