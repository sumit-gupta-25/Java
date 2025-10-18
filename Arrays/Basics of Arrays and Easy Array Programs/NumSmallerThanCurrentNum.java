import java.util.Arrays;
import java.util.Scanner;;

public class NumSmallerThanCurrentNum {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smaller = new int[nums.length];

        for (int i = 0; i < smaller.length; i++) {
            int num = 0;
            for (int j = 0; j < smaller.length; j++) {
                if (nums[j] < nums[i]) {
                    num += 1;
                }
            }
            smaller[i] = num;
        }

        return smaller;
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

        int[] smaller = smallerNumbersThanCurrent(arr);

        System.out.println("Numbers smaller than current number: " + Arrays.toString(smaller));

        sc.close();
    }
}
