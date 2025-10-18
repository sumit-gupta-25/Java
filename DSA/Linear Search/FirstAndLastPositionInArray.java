public class FirstAndLastPositionInArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int[] result = searchRange(nums, target);
        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                start = i;
                break;
            }
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                end = j;
                break;
            }
        }
        if (start == 0 && nums[start] != target) {
            return new int[]{-1, -1}; // Target not found
        }
        return new int[]{start, end}; 
    }
}
