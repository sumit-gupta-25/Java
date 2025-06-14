//Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the currency in Rupees: ");
        double rupees = sc.nextDouble();

        double usd = rupees * 0.011614; //The rate of dollar changes daily so multiply rupees with the current rate.

        System.out.println("The Currency in USD: " + usd);
        sc.close();
    }
}
