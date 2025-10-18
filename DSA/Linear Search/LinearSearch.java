public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {25, 8, 2, 10, 33};
        int target = 8;

        int result = linearSearch(nums, target);
        System.out.print("Target found at position: " + result);
    }

    // search in the array: return index if item found
    // otherwise if item not found return -1
    static int linearSearch (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1;
    }

    // To return the number itself
    static int linearSearch2 (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }


    // To return the true or false
    static boolean linearSearch3 (int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        return false;
    }
}