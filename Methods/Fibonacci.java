import java.util.Scanner;

public class Fibonacci {
    // Method to print fibonacci series
    public static void fibonacci (int n) {
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series upto " + n + " terms is: ");
         for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms you want to print: ");
        int n = sc.nextInt();

        fibonacci(n);

        sc.close();
    }
}
