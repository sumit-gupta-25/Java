public class Floor {
    public static void main(String[] args) {
        int[] num = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        int result = floor(num, target);
        System.out.println("Target found at: " + result);
    }

    // return index of greatest number <= target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find middle element
            // int mid = (start + end) / 2;  // might be possible start + end exceed the range of integer
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
