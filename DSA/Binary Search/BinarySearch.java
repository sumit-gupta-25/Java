public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {2, 4, 8, 9, 11, 20, 25, 46, 70};
        int target = 25;

        int result = binarySearch(num, target);
        System.out.println("Target found at: " + result);
    }

    // return index of element 
    static int binarySearch(int[] arr, int target) {
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
        return -1;
    }
}