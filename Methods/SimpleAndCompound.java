// Calculating Simple and Compound interest

import java.util.Scanner;

public class SimpleAndCompound {
    // Method to calculate simple interest
    public static double simpleInterest (double p, int t, double r) {
        double simple = (p * r * t) / 100;

        return simple;
    }

    // Method to calculate compound interest
    public static double compoundInterest (double p, double r, int t, double n) {
        double amount = p * Math.pow((1 + (r / (n * 100))), (n * t));
        double compound = amount - p;

        return compound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter which interest you want to calculate (simple or compound): ");
        String interest = sc.nextLine().toLowerCase();

        if (interest.equals("simple")) {
            System.out.print("Enter principal amount: ");
            double principal = sc.nextDouble();
            System.out.print("Enter number of years: ");
            int year = sc.nextInt();
            System.out.print("Enter Rate of Interest: ");
            double rate = sc.nextDouble();

            double simpleInterest = simpleInterest(principal, year, rate);
            System.out.println("Simple Interest: " + simpleInterest);
        }
        else if (interest.equals("compound")) {
            System.out.print("Enter principal amount: ");
            double principal = sc.nextDouble();
            System.out.print("Enter number of years: ");
            int year = sc.nextInt();
            System.out.print("Enter Rate of Interest: ");
            double rate = sc.nextDouble();
            System.out.print("Enter number of times interest is compounded per year: ");
            double n = sc.nextDouble();

            double compoundInterest = compoundInterest(principal, rate, year, n);
            System.out.println("Compound Interest: " + compoundInterest);
        }
        else {
            System.out.println("Invalid input.");
        }

        sc.close();
    }
}
