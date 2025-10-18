import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMatrix {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int colIndex = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    colIndex = j;
                }
            }

            boolean isMaxInCol = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][colIndex] > min) {
                    isMaxInCol = false;
                    break;
                }
            }

            if (isMaxInCol) {
                result.add(min);
            }
        }

        return result;
    }

     public static void main(String[] args) {
        int[][] matrix = {
            {3, 7, 8},
            {9, 11, 13},
            {15, 16, 17}
        };

        List<Integer> luckyNums = luckyNumbers(matrix);
        System.out.println("Lucky numbers: " + luckyNums);
    }
}
