//To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("The Armstrong number between" + start + "and" + end + "is: ");

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();  

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits); 
            num /= 10;
        }

        return sum == original;
    }
}
