import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int [][] numbers = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2D array of integers (matrix) with 2 rows and 3 columns (2x3)
        numbers[0][0] = 10; // Assign 10 to the first element of the first row
        numbers[1][0] = 20; // Assign 20 to the first element of the second row
        numbers[0][1] = 30; // Assign 30 to the second element of the first row
        numbers[1][2] = 40; // Assign 40 to the third element of the second row

        System.out.println(Arrays.deepToString(numbers)); // Output: [[1, 0, 0], [0, 0, 0]] Arrays.deepToString() is used to print the 2D array.
    }
}
