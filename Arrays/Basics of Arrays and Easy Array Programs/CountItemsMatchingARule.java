import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountItemsMatchingARule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;

        // Using different index for type, color and name
        if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }

        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<List<String>> items = new ArrayList<>();
        System.out.println("Enter items (type color name):");
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            items.add(Arrays.asList(parts));
        }

        System.out.print("Enter ruleKey (type/color/name): ");
        String ruleKey = sc.nextLine().trim();
        System.out.print("Enter ruleValue: ");
        String ruleValue = sc.nextLine().trim();

        int result = countMatches(items, ruleKey, ruleValue);
        System.out.println("Number of matching items: " + result);

        sc.close();
    }
}
