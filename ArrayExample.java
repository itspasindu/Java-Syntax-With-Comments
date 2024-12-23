import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 }; // Array of integers
        numbers[0] = 60; // Change the value of the first element
        Arrays.sort(numbers); // Sort the array in ascending order

        System.out.println(numbers.length); // Output: 5
        System.out.println(numbers[0]); // Output: 20
        System.out.println(java.util.Arrays.toString(numbers)); // Output: [60, 20, 30, 40, 50] Arrays.toString() is used to print the array.
    }
}
