import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6 
        7 8 9
        */

        //int[][] arr = new int[3][];

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(arr[2][1]);

        // input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // output
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // output
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        for (int[] a : arr) {    // Every single element is itself an array (int[] is used)
            System.out.println(Arrays.toString(a));
        }

        sc.close();
    }
}
