// Future Investment Value

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Investment Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Annual Interest Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Number of times interest is compounded per year: ");
        double n = sc.nextDouble();
        System.out.print("Enter Number of Years: ");
        int time = sc.nextInt();

        double futureValue = principal * Math.pow(1 + (rate/ (n * 100)), n * time);
        System.out.printf("Future Investment Value: %.2f Rs.%n", futureValue);

        double interestEarned = futureValue - principal;
        System.out.printf("Interest Earned: %.2f Rs.%n", interestEarned);

        sc.close();
    }
}
