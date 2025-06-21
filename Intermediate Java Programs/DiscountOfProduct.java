// Calculate discount of product

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of the product: ");
        String product = sc.nextLine();
        System.out.print("Enter cost of product: ");
        int cost = sc.nextInt();
        System.out.print("Enter discount percent: ");
        int percent = sc.nextInt();

        double discount = (cost * percent)/100;

        double finalcost = cost - discount;

        System.out.println("\nProduct Name: " + product);
        System.out.println("Cost of the product: " + cost + " Rs.");
        System.out.println("Discount on the product: " + percent + " %");
        System.out.println("Total discount : " + discount + " Rs.");
        System.out.println("Final cost of the product: " + finalcost + " Rs.");

        sc.close();
    }
}
