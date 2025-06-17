//Addition Of Two Numbers

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the two numbers for addition: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int addition = num1 + num2;
        System.out.println("Addition of two numbers " + num1 + " + " + num2 + " = " + addition );

        sc.close();
    }
}
