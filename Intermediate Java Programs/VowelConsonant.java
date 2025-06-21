// Input character and check whether it is 

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid Input. Please enter an alphabet letter (A to Z or a to z)");
        }
        else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            System.out.println("Character" + ch + " is a vowel");
        } else {
            System.out.println("Character" + ch + " is a consonant");
        }

        sc.close();
    }
}
