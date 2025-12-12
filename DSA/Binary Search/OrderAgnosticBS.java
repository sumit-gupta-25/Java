public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] num = {99, 70, 54, 38, 25, 18, 8, 2, 0, -8};
        int target = 0;

        int result = orderAgnosticBS(num, target);
        System.out.println("Target found at: " + result);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending order.
        boolean isAscending = arr[start] < arr[end];
        
        while (start <= end) {
            // find middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                } 
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
