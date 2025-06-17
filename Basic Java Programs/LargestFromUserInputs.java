//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargestFromUserInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest = 0;
        int num;

        System.out.println("Enter number to find largest number (enter 0 to stop): ");

        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }    
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("The largest number entered: " + largest);

        sc.close();
    }
}
