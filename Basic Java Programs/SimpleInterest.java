//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        int principal = sc.nextInt();
        System.out.println("Enter the number of years: ");
        int time = sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        float rate = sc.nextFloat();

        float result = (principal * rate * time)/100;
        System.out.println("Simple Interest = " + result);

        sc.close();
    }
}
