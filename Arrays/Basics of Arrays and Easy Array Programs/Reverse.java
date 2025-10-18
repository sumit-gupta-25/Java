import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));

        sc.close();
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


}
