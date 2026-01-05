import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for(int i = start; i <= end; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }   
} 

