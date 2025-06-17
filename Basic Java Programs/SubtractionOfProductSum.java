//Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class SubtractionOfProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();
        
        int original = n;
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        int result = product - sum;
        System.out.println("For number" + original + ", Product - Sum = " + result);

        sc.close();
    }
}
