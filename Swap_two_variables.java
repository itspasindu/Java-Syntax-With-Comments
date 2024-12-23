public class Swap_two_variables {
    public static void main(String[] args) {
        String x = "Hot Water"; // Declare and initialize a variable x with a value of "Hot Water"
        String y = "Cold Water"; // Declare and initialize a variable y with a value of "Cold Water"
        String temp; // Declare a variable temp

        temp = x; // Assign the value of x to temp
        x = y; // Assign the value of y to x
        y = temp; // Assign the value of temp to y

        System.out.println("x: " + x); // Display the value of x
        System.out.println("y: " + y); // Display the value of y
    }
}
