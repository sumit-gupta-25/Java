public class FindMin {
    public static void main(String[] args) {
        int[] nums = {25, 8, 2, 10, -33};

        int result = min(nums);
        System.out.print("Minimum number in the array is: " + result);
    }

    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
