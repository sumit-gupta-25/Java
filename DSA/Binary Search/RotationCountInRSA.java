public class RotationCountInRSA {
    public static void main(String[] args) {
        int[] num = {4, 5, 6 ,7, 0, 1 ,2};

        int result = rotationCount(num);

        System.out.println("Number of Rotations: " + result);
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // return the number of rotations
    static int rotationCount(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }
}
