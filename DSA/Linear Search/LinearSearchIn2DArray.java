import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
            {25, 8, 18, 21},
            {27, 1},
            {10, 2, 7, 11},
            {6, 1, 18} 
        };
        int target = 11;

        int[] result = search(nums, target);
        System.out.print(Arrays.toString(result));
    }

    static int[] search (int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
