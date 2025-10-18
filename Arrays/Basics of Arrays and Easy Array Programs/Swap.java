import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 8, 10, 25, 30};

        System.out.print("Enter first index: ");
        int index1 = sc.nextInt();
        System.out.print("Enter second index: ");
        int index2 = sc.nextInt();

        System.out.println("Before Swapping: " + Arrays.toString(arr));

        swap(arr, index1, index2);

        System.out.println("After Swapping: " + Arrays.toString(arr));

        sc.close();
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
