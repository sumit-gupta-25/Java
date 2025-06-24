// Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class PrimeNumberInRange {
    // Method to check whether a number is prime or not
    public static boolean isPrime (int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }    
        
    // Method that returns all prime numbers between two given numbers
    public static void primeNumber (int start, int end) {     
        System.out.println("Prime numbers between " + start + " and " + end + " is:");
        
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        primeNumber(start, end);

        sc.close();
    }
}
