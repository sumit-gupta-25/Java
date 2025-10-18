import java.util.Scanner;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int customerWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                customerWealth += accounts[i][j];
            }

            if (customerWealth > maxWealth) {
                maxWealth = customerWealth;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        System.out.print("Enter number of banks: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter amount of many in each bank account of customer: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Customer " + (i + 1) + ": ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxWealth = maximumWealth(arr);
        System.out.println("Wealth of the Richest Customer is: " + maxWealth);

        sc.close();
    }
}