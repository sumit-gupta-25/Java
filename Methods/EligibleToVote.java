// A person is eligible to vote if his/her age is greater than or equal to 18. 
// Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class EligibleToVote {
    // Method to check whether the person is eligible or not
    public static boolean isEligible(int num) {
        if (num >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String person = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (isEligible(age)) {
            System.out.println(person + " is eligible to vote.");
        } else {
            System.out.println(person + " is Not eligible to vote.");
        }

        sc.close();
    }
}
