public class ArithmeticExpressions {
    public static void main(String[] args) {
        int x = 1;
        int y = x++; // Post-increment: assign the value of x to y, then increment x by 1

        System.out.println(x); // Output: 2
        System.out.println(y); // Output: 1
    }
}

/*
 * Arithmetic Expressions in Java
 * x++ is a post-increment operator. It first assigns the value of x to y, then increments x by 1.
 * ++x is a pre-increment operator. It first increments x by 1, then assigns the value of x to y.
 * x-- is a post-decrement operator. It first assigns the value of x to y, then decrements x by 1.
 * --x is a pre-decrement operator. It first decrements x by 1, then assigns the value of x to y.
 * x+=y is equivalent to x = x + y. It adds the value of y to x and assigns the result to x.
 * x-=y is equivalent to x = x - y. It subtracts the value of y from x and assigns the result to x.
 * x*=y is equivalent to x = x * y. It multiplies x by y and assigns the result to x.
 * x/=y is equivalent to x = x / y. It divides x by y and assigns the result to x.
 * x%=y is equivalent to x = x % y. It calculates the remainder of x divided by y and assigns the result to x.
 * 
 */