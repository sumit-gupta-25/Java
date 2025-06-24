import java.util.Scanner;
import java.time.LocalTime;

public class Greeting {
    // Method to greet the user according to the current time.
    public static void greeting (String s) {
        LocalTime currenTime = LocalTime.now();
        int hour = currenTime.getHour();
        
        String greeting;

        if (hour >= 5 && hour <= 12) {
            greeting = "Good Morning";
        }
        else if (hour >= 12 && hour <= 5) {
            greeting = "Good Afternoon";
        }
        else if (hour >= 17 && hour <= 21) {
            greeting = "Good Evening";
        }
        else {
            greeting = "Good Night";
        }

        System.out.println(greeting + ", " + s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        greeting(name);

        sc.close();
    }
}
