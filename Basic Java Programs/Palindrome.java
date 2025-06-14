//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check whether it is Palindrome or not: ");
        String s = sc.nextLine().toLowerCase();

        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(s + " is a Palindrome.");
        } else {
            System.out.println(s + " is not a Palindrome.");
        }

        sc.close();
    }
}
