// while loop in java is used to execute a block of statements continuously until the given condition is true. It is used when the number of iterations is not known in advance.

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = ""; // initialize the name variable with an empty string

        while (name.isBlank()) { // while the name is empty, keep asking for the name 
            System.out.print("Please enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello, " + name + "!"); // print the name
    }
    
}

// In this program, we are using a while loop to keep asking the user for their name until they enter a non-empty name. The condition name.isBlank() checks if the name is empty or not. If the name is empty, the loop continues to ask for the name. Once the user enters a non-empty name, the loop exits, and the program prints a greeting message with the entered name.