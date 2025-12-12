// Find in Mountain Array
public class Leetcode1095 {
    interface MountainArray {
    public int get(int index);
    public int length();
    }

    public int findInMountainArray(int target, MountainArray arr) {
        int peak = peakIndexInMountainArray(arr);

        // Search in ascending part
        int firstTry = binarySearchAscending(arr, target, 0, peak);
        if (firstTry != -1) return firstTry;

        // Search in descending part
        return binarySearchDescending(arr, target, peak + 1, arr.length() - 1);
    }


    private int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid; 
            } else {
                start = mid + 1;
            }
        }
        return start;
    }


    private int binarySearchAscending(MountainArray arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int value = arr.get(mid);

            if (value == target) return mid;
            if (value < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }


    private int binarySearchDescending(MountainArray arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int value = arr.get(mid);

            if (value == target) return mid;
            if (value > target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
