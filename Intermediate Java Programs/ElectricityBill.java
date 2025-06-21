// Calculate Electricity bill with reference to eletricity units consumed.

/*
Rate of units consumed 
(This is the rate of electricity unit charged by Adani Electricity approved by MERC(June-25))
0 - 100 units         : Rs. 3.45 per unit
101 - 300 units       : Rs. 5.55 per unit
301 - 500 units       : Rs. 7.45 per unit
501 units and above   : Rs 8.55 per unit
*/

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer Name: ");
        String consumer = sc.nextLine();

        System.out.print("Enter number of units consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        if (units <= 100) {
            bill = units * 3.45; // Rate of unit for 0 - 100 units.
        }
        else if (units <= 300) {
            bill = (100 * 3.45) + (units - 100) * 5.55; // Rate of unit for 101 - 300 units.
        }
        else if (units <= 500) {
            bill = (100 * 3.45) + (200 * 5.55) + (units - 300) * 7.45; // Rate of unit for 301 - 500 units.
        }
        else {
            bill = (100 * 3.45) + (200 * 5.55) + (200 * 7.45) + (units - 500) * 8.55;
            // Rate of unit for the units above 500 units.
        }

        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer Name: " + consumer);
        System.out.println("Units Consumed: " + units);
        System.out.printf("Bill Amount: Rs.%.2f%n", bill);

        sc.close();
    }
}
