import java.util.Arrays;
import java.util.Scanner;

public class NUniqueIntegersSumUpto0 {
    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int num = 1;

        for (int i = 0; i < n / 2; i++) {
            result[i] = num;
            result[n - 1 - i] = -num;
            num++;
        }

        // If n is odd, put 0 in the middle
        if (n % 2 != 0) {
            result[n / 2] = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] result = sumZero(n);
        System.out.println("Unique integers summing to 0: " + Arrays.toString(result));

        sc.close();
    }
}
