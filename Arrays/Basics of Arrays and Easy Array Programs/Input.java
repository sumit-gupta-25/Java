import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 18;
        arr[2] = 21;
        arr[3] = 25;
        arr[4] = 27;
        // [8, 18, 21, 25, 27]
        System.out.println(arr[3]);

        // input using for loops
        // for (int i = 0; i < arr.length; i++) {    // arr.length --- array size
        //     arr[i] = sc.nextInt();
        // }

        //for (int i = 0; i < arr.length; i++) {
        //    System.out.println(arr[i] + " ");
        //}

        // for (int num : arr) {   // for every element in the array print the array
        //     System.out.print(num + " ");
        // }

        // System.out.println(arr[5]); // index out of bound error

        //array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        //Modify
        str[1] = "Modify";
        System.out.println(Arrays.toString(str));

        // for (String element : str) {
        //     System.out.println(element);
        // }

        sc.close();
    }
}