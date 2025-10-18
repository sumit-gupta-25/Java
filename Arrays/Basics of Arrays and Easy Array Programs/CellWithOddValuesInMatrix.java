import java.util.Scanner;

public class CellWithOddValuesInMatrix {
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];

            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }

            for (int i = 0; i < m; i++) {
                matrix[i][col]++;
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = sc.nextInt();
        
        System.out.print("Enter the number of operations (size of indices): ");
        int size = sc.nextInt();
         int[][] indices = new int[size][2];
        System.out.println("Enter each pair (row and column index):");
        for (int i = 0; i < size; i++) {
            indices[i][0] = sc.nextInt();
            indices[i][1] = sc.nextInt();
        }

        int oddNumbers = oddCells(m, n, indices);
        System.out.println("Number of odd-valued cells: " + oddNumbers);

        sc.close();
    }
}
