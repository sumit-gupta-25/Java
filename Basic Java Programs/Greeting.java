//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){       
        Scanner sc = new Scanner(System.in);        
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Good Morning!, " + name);

        sc.close();
    }
}
