public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 6, 7896};
        int numbers = findNumbers(arr);
        System.out.println(numbers);
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);

        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num){
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}
