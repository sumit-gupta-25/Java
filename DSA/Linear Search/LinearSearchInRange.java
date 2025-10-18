public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] nums = {25, 8, 2, 10, 33};
        int target = 25;
        int start = 1;
        int end = 4;

        int result = linearSearchInRange(nums, target, start, end);
        System.out.println("Target found at position: " + result);
    }

    static int linearSearchInRange (int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1;
    }
}

