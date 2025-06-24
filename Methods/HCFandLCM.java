import java.util.Scanner;

public class HCFandLCM {
    // Method to get the HCF of two numbers.
    public static int hcf (int num1, int num2) {
        int hcf = 0;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    // Method to get the LCM of two numbers.
    public static int lcm (int num1, int num2) {
        int hcf = hcf(num1, num2);
        int lcm = (num1 * num2) / hcf;

        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcf = hcf(num1, num2);
        int lcm = lcm(num1, num2);

        System.out.println("\n--- Result ---");
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
}
