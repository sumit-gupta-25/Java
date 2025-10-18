public class MinimumCostToMoveChips {
    public static int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;

        for (int i : position) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(even, odd);
    }

    public static void main(String[] args) {
        int[] position = {1, 2, 3};  // Example Testcase
        System.out.println("Minimum cost to move chips: " + minCostToMoveChips(position));
    }
}
