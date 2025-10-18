import java.util.Arrays;

public class MatrixRotationCheck {
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isSame(mat, target)) {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    // Checking if matrix is equal to target.
    private static boolean isSame(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            if (!Arrays.equals(mat1[i], mat2[i])) {
                return false;
            }
        }
        return true;
    }

    // Rotate matrix
    private static int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }

        return rotated;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {0, 1},
            {1, 0}
        };
        int[][] target = {
            {1, 0},
            {0, 1}
        };

        boolean result = findRotation(mat, target);
        System.out.println("Can mat be rotated to match target? " + result);
    }
}
