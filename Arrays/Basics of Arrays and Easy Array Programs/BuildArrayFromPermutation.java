// Question from leetcode.
/* 
Given a zero-based permutation nums (0-indexed), build an array ans of the same length 
where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it. 
*/

import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an array: ");

        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = buildArray(arr);
        System.out.println("Result: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}
