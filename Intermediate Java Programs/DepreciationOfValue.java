/*
Depreciation of Value -- the decrease in the worth of an asset over time
Using the Straight Line Method (SLM)
*/

import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter initial cost of asset: ");
        double cost = sc.nextDouble();

        System.out.print("Enter salvage value: ");  // Value After Life Ends
        double salvage = sc.nextDouble();

        System.out.print("Enter useful life in years: ");
        int years = sc.nextInt();

        double depreciation = (cost - salvage) / years;

        System.out.printf("Annual Depreciation: %.2f Rs.", depreciation);
        
        sc.close();
    }
}
