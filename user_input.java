import java.util.Scanner; // Import the Scanner class

public class user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter Your Name: "); // Display the string
        String name = scanner.nextLine(); // Read user input

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt(); // Read user input. nextInt() is use for integer input
        scanner.nextLine(); // Read the newline character. This is needed because nextInt() does not read the newline character

        System.out.print("What's Your Favorite Sport? ");
        String sport = scanner.nextLine();


        System.out.println("Hello: " + name); // Display the string with the user input
        System.out.println("Your Age: " + age); // Display the string with the user input
        System.out.println("Favorite Sport: " + sport);
    }
}
