import java.util.Scanner;

public class PermutationAndCombination {
    // Method to calculate factorial of a number
    public static long factorial (int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate nCr (Combination)
    public static double nCr (int n, int r) {
        double nFactorial = factorial(n);
        double rFactorial = factorial(r);
        double nminusrFactorial = factorial((n - r));

        double nCr = nFactorial / (rFactorial * (nminusrFactorial));

        return nCr;
    }

    // Method to calculate nPr (Permutation)
    public static double nPr (int n, int r) {
        double nFactorial = factorial(n);
        double nminusrFactorial = factorial((n - r));

        double nPr = nFactorial / nminusrFactorial;

        return nPr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        double nCr = nCr(n, r);
        double nPr = nPr(n, r);

        System.out.println("Combination nCr: " + nCr);
        System.out.println("Permutation nPr: " + nPr);

        sc.close();
    }
}
