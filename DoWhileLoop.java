import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = ""; // initialize the name variable with an empty string

        do {
            System.out.print("Please enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());

        System.out.println("Hello, " + name + "!"); // print the name
    }
}

/*  In this program, we are using a do-while loop to keep asking the user for their name until they enter a non-empty name. The loop will execute at least once, even if the condition is false initially. The condition name.isBlank() checks if the name is empty or not. If the name is empty, the loop continues to ask for the name. Once the user enters a non-empty name, the loop exits, and the program prints a greeting message with the entered name. 

*/