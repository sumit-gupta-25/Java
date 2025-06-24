// Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class PrimeNumber {
    // Method to find out if a number is prime or not.
    public static boolean isPrime(int n) {
        if (n <= 1) 
            return false;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) 
                return false;
        }

        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is Not a Prime Number");
        }

        sc.close();
    }
}
