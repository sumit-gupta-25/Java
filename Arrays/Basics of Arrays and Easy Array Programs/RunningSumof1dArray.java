import java.util.Arrays;
import java.util.Scanner;

public class RunningSumof1dArray {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of  array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] runningSum = runningSum(arr);

        System.out.println("Running sum of array is: " + Arrays.toString(runningSum));

        sc.close();
    }    
}
