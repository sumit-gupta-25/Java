//Calculate compound interest

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter number of times interest is compounded per year: ");
        double n = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        double t = sc.nextDouble();

        double amount = principal * Math.pow((1 + rate / (n * 100)), n * t);

        double CI = amount - principal;

        System.out.printf("\nCompund Interest: %.2f Rs. %n", CI);
        System.out.printf("\nTotal Amount after %.1f years: %.2f Rs. %n", t, amount);

        sc.close();
    }
}
