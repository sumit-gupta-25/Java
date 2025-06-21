//Calculate Batting Average

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name of Batsman: ");
        String name = sc.nextLine();

        System.out.print("Enter total runs scored: ");
        double runs = sc.nextInt();

        System.out.print("Enter number of dismissals: ");
        double dismissals = sc.nextInt();

        double average = runs / dismissals;

        System.out.println("\nName of Batsman: " + name);
        System.out.println("Total Runs Scored: " + runs);
        System.out.println("Number of Dismissals: " + dismissals);
        System.out.printf("Batting Average: %.2f%n", average);

        sc.close();
    }
}
