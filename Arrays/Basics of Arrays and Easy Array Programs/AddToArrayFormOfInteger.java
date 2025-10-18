import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddToArrayFormOfInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;   // start from least‑significant digit
        int carry = 0;

        while (i >= 0 || k > 0) {
            int digitNum = (i >= 0) ? num[i] : 0;
            int digitK   = k % 10;
            int sum      = digitNum + digitK + carry;

            result.add(sum % 10);   // store current digit
            carry = sum / 10;       // update carry

            k /= 10;
            i--;
        }

        if (carry > 0) result.add(carry);

        // digits were collected in reverse order ⇒ reverse before returning
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read array‑form
        System.out.print("Enter number of digits in num: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.print("Enter the digits: ");
        for (int i = 0; i < n; i++) num[i] = sc.nextInt();

        // read k
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // compute and print result
        List<Integer> ans = addToArrayForm(num, k);
        System.out.print("Resulting array‑form: ");
        for (int d : ans) System.out.print(d + " ");
        System.out.println();
        sc.close();
    }
}
