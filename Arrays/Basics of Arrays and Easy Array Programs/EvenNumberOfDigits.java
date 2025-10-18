import java.util.Scanner;

public class EvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int evenNum = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            if (nums[i] == 0) {
                count = 1;
            }
            else {
                nums[i] = Math.abs(nums[i]);
                while (nums[i] > 0) {
                    nums[i] /= 10;
                    count++;
                }
            }

            if (count % 2 == 0) {
                evenNum++;
            }
        }
        return evenNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }

        int evenNumberOfDigits = findNumbers(arr);
        System.out.println("Numbers with Even Number of Digits: " + evenNumberOfDigits);

        sc.close();
    }
}
