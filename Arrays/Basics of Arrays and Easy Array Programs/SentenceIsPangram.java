import java.util.Scanner;

public class SentenceIsPangram {
    public static boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];

        for (char ch : sentence.toCharArray()) {
            seen[ch - 'a'] = true;
        }

        for (boolean alphabetSeen : seen) {
            if (!alphabetSeen) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Sentence: ");
        String sentence = sc.nextLine().toLowerCase().trim();

        if (checkIfPangram(sentence)) {
            System.out.println("The given sentence is a Pangram.");
        }
        else{
            System.out.println("The given sentence is Not a Pangram.");
        }

        sc.close();
    }
}
