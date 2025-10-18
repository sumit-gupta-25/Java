public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
            {25, 8, 18, 21},
            {27, 1},
            {10, 2, 7, 11},
            {6, 1, 18} 
        };

        int result = max(nums);
        System.out.print(result);
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
