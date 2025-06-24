// Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class EvenOdd {
    // Method to find out whether a given number is even or odd.
    public static String evenOdd(int num){
        if(num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = evenOdd(num);

        System.out.println("The number " + num + " is: " + result);

        sc.close();
    }
}
