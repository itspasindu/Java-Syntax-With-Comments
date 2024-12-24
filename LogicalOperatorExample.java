import java.util.Scanner;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit the game.");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game!");
        } else {
            System.out.println("You are still playing the game!");
        }
    }
}

/* if (response.equals("q") || response.equals("Q")) means that if the response is equal to "q" or "Q", the message "You quit the game!" will be printed. || is the logical OR operator. It returns true if either of the operands is true. If both operands are false, it returns false. In this case, if the response is "q" or "Q", the condition is true, and the message "You quit the game!" will be printed. Otherwise, the message "You are still playing the game!" will be printed.
 */