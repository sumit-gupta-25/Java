import java.util.Scanner;

public class MultiplicationTable {
    // Method to print the multiplication table of input number.
    public static void multiplicationTable (int n) {
        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            System.out.println(n + " * " + i + " = " + product);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        multiplicationTable(num);

        sc.close();
    }
}
