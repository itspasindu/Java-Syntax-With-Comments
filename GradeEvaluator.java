/*
Question: Grade Evaluator
Write a Java program that:

Prompts the user to input their name and score (out of 100).
Uses comparison operators to determine the grade based on the following criteria:
A: Score >= 85
B: Score >= 65 and < 85
C: Score >= 55 and < 65
S: Score >= 32 and < 55
W: Score < 35
Displays the user’s name, score, and the corresponding grade.
 */


import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Your Marks: ");
        int marks = scanner.nextInt();
        scanner.nextLine();

        if (marks < 0 || marks > 100) {
            System.out.println("Please enter valid marks between 0 and 100.");
        } else if (marks >= 85) {
            System.out.println("Hello " + name + ", Your Grade is A");
        } else if (marks >= 65) {
            System.out.println("Hello " + name + ", Your Grade is B");
        } else if (marks >= 55) {
            System.out.println("Hello " + name + ", Your Grade is C");
        } else if (marks >= 35) {
            System.out.println("Hello " + name + ", Your Grade is S");
        } else {
            System.out.println("Hello " + name + ", Your Grade is W");
        }

        scanner.close();
    }
}
