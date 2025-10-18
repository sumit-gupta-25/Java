public class MaximumPopulationYear {
    public static int maximumPopulation(int[][] logs) {
        int[] year = new int[101]; // from 1950 to 2050 (inclusive) → 2050 - 1950 + 1 = 101

        for (int[] log : logs) {
            year[log[0] - 1950]++;    // person born → +1
            year[log[1] - 1950]--;    // person died → -1 (death year is not counted)
        }

        int maxYear = 1950;
        int maxPopulation = year[0];
        for (int i = 1; i < 101; i++) {
            year[i] += year[i - 1];  // prefix sum

            if (year[i] > maxPopulation) {
                maxPopulation = year[i];
                maxYear = 1950 + i;
            }
        }

        return maxYear;
    }

    public static void main(String[] args) {
        int[][] logs = {
            {1950, 1961},
            {1960, 1971},
            {1970, 1981}
        };

        int result = maximumPopulation(logs);
        System.out.println("Maximum population year: " + result);
    }
}
