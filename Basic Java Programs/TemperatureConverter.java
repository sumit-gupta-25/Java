// Convert temperature from celsius to fahrenheit

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in degree celsius: ");
        int degree = sc.nextInt();

        double result = (degree * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + result + "°F");
        
        sc.close();
    }

    /*
    Conversion of Fahrenheit to Degree Celsius.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double result = (fahrenheit − 32) × 5/9;
        System.out.println("Temperature in Degree Celsius: " + result + "°C");
        
        sc.close();
    }
     */
}
