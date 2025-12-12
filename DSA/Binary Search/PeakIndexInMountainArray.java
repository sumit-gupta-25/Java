public class PeakIndexInMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in decreasing part of array
                // this may be the ans, but look at left side
                end = mid;
            } else {
                // you are in ascending part of array
                start = mid + 1; // because we know that mid+1 element is greater than mid element
            }
        }
        // in the end, start == end pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        return start; // or return end as both are equal
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 5, 3, 2, 1};

        int result = peakIndexInMountainArray(num);
        System.out.println("Peak Index found at: " + result);
    }
}
