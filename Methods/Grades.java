/*
Write a program that will ask the user to enter his/her marks (out of 100). 
Define a method that will display grades according to the marks entered as below: 
Marks        Grade 
91-100         O 
81-90          A 
71-80          B 
61-70          C 
51-60          D 
41-50          E 
<=40          Fail 
*/

import java.util.Scanner;

public class Grades {
    // Method that will display grades according to the marks
    public static String grades(int marks) {
        if (marks >= 91 && marks <= 100) {
            return "O";
        } 
        else if (marks >= 81) {
            return "A";
        }
        else if (marks >= 71) {
            return "B";
        }
        else if (marks >= 61) {
            return "C";
        }
        else if (marks >= 51) {
            return "D";
        }
        else if (marks >= 41) {
            return "E";
        }
        else {
            return "FAIL";
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter your marks (out of 100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input! Marks should be between 0 to 100 marks");
        } else {
            String grade = grades(marks);
            System.out.println("Your Grade: " + grade + " grade");
        }

        sc.close();
    }
}
