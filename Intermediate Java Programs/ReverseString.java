// Input a string and print the reverse of that string.

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        //Using String Builder
        //String reversed = new StringBuilder(s).reverse().toString();

        //Using Loops
        String revresed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revresed += s.charAt(i);
        }

        System.out.println("Revered String: " + revresed);

        sc.close();
    }
}
