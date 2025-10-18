import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithGreatestNoOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of  array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of extra candies: ");
        int extraCandies = sc.nextInt();

        List<Boolean> result = kidsWithCandies(arr, extraCandies);

        System.out.println(result);

        sc.close();
    }
}
