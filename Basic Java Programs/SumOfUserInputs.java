//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class SumOfUserInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num;

        System.out.println("Enter numbers to add (enter 0 to stop): ");

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println("Sum of all entered numbers: " + sum);

        sc.close();
    }
}
