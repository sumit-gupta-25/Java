import java.util.Scanner;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int num = 0;

        for (int i = 0;  i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    num += 1;
                }
            }
        }

        return num;
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

        int numOfIdenticalPairs = numIdenticalPairs(arr);

        System.out.println("Number of Good Pairs: " + numOfIdenticalPairs);

        sc.close();
    }
}
