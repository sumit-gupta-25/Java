public class FlippingAnImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int start = 0;
            int end = row.length - 1;

            while (start <= end) {
                // Swap and invert using XOR
                int temp = row[start] ^ 1;
                row[start] = row[end] ^ 1;
                row[end] = temp;

                start++;
                end--;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };

        int[][] flippedImage = flipAndInvertImage(image);
        for (int i = 0; i < flippedImage.length; i++) {
            for (int j = 0; j < flippedImage[i].length; j++) {
                System.out.print(flippedImage[i][j] + " ");
            }
            System.out.println();
        }
    }
}

