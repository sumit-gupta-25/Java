import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n){
        int[] shuffleArr = new int[nums.length];
        for (int i = 0, j = 0; i < n; i++) {
            shuffleArr[j++] = nums[i];
            shuffleArr[j++] = nums[i + n];
        }

        return shuffleArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[2 * n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = shuffle(arr, n);

        System.out.println("Shuffled Array: " + Arrays.toString(ans));

        sc.close();
    }
}
