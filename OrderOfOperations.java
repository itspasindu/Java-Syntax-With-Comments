public class OrderOfOperations {
    public static void main(String[] args) {
        int x = (10+3) * 2; // 13 * 2 = 26 () has the highest precedence
        int y = 10 + 3 * 2; // 10 + 6 = 16

        System.out.println(x); // Output: 26
        System.out.println(y); // Output: 16
    }
}

/*
 * Order of Operations in Java
 * Parentheses () have the highest precedence and are evaluated first.
 * Multiplication * and division / have the next highest precedence.
 * Addition + and subtraction - have the lowest precedence.
 * Operators with the same precedence are evaluated from left to right.
 */