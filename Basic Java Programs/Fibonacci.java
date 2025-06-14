//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number till you want to print the fibonacci series: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci series upto" + n + "terms");

        //Printing fibonacci series till n number.
        while(a <= n){                      //Here, we can use for loop if we want to print fibonacci series of n numbers
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
        
        sc.close();
    }
}
