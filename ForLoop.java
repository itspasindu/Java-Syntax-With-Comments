// for loop in java is used to execute a block of statements repeatedly until the given condition is true. It is used when the number of iterations is known in advance.

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("Done!");
    }
}

/*
 * In this program, we are using a for loop to print numbers from 10 to 0. The loop starts with i = 10, and it continues as long as i is greater than or equal to 0. The loop decrements the value of i by 1 in each iteration (i--). The loop prints the value of i in each iteration. Once i becomes less than 0, the loop exits, and the program prints "Done!".
 */