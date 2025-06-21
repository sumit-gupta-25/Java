//Find Ncr (Combination) & Npr (Permutation)

/*
NCR (Combination): 
𝑛𝐶𝑟 = 𝑛! / 𝑟! (𝑛 − 𝑟)!
NPR (Permutation):
𝑛𝑃𝑟 = 𝑛! / (𝑛 − 𝑟)!
*/

import java.util.Scanner;

public class NCRandNPR {
    
    // Method to calculate factorial
    public static long Factorial(int num){
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        if (r > n) {
            System.out.println("Invalid input: r should not be greater than n.");
        } else {
            long nFact = Factorial(n);
            long rFact = Factorial(r);
            long nminusrFact = Factorial(n - r);

            long nCr = nFact / (rFact * nminusrFact);
            long nPr = nFact / nminusrFact;

            System.out.println("nCr (Combination): " + nCr);
            System.out.println("nPr (Permutation): " + nPr);
        }

        sc.close();
    }
}
