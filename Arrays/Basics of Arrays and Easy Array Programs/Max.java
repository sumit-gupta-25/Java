import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter five elements of the array: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = max(arr);
 
        System.out.println("Max element: " + max);
        
        sc.close();
    }

    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // If you want to return max from a specific range in an array.
    public static int max(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
