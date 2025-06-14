//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = Math.max(num1, num2);

        System.out.print("The Largest number is " + result);
        sc.close();
    }*/

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("The Largest number is " + num1);
        } else {
            System.out.println("The Largest number is " + num2);
        }

        sc.close();
    }

}


