// Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num =sc.nextInt();

        if (isPalindrome(num) == true) {
            System.out.println(num + " is a Palindrome.");
        }
        else {
            System.out.println(num + " is Not a palindrome.");
        }
        
        sc.close();
    }
}
