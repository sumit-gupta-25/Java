import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TargetArrayInGivenOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        
        // To convert List<Integer> to int[]
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = target.get(i);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of  array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] index = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index: ");
        for (int i = 0; i < arr.length; i++) {
            index[i] = sc.nextInt();
        }

        int[] target = createTargetArray(arr, index);
        System.out.println("Target in the given order: " + Arrays.toString(target));

        sc.close();
    }
}
