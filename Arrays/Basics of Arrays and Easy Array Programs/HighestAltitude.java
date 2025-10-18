import java.util.Scanner;

public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;

        for (int g : gain) {
            altitude += g;
            maxAltitude = Math.max(maxAltitude, altitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the gain in altitude: ");
        int[] gain = new int[n];
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int maxAltitude = largestAltitude(gain);
        System.out.println("Highest Altitude: " + maxAltitude);

        sc.close();
    }
}
