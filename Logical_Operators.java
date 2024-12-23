public class Logical_Operators {
    public static void main(String[] args) {
        boolean HasHighIncome = true;
        boolean HasGoodCredit = true;
        boolean HasCriminalRecord = false;
        boolean isEligible = (HasHighIncome || HasGoodCredit) && !HasCriminalRecord ; /*  || is the logical OR operator and ! is the logical NOT operator. first condition and second condition must be true and third condition must be false */

        System.out.println(isEligible); // Output: true
    }
}

/*
 * Logical Operators
 * && - Logical AND operator. Returns true if both conditions are true
 * || - Logical OR operator. Returns true if one of the conditions is true
 * ! - Logical NOT operator. Reverses the result of the condition
 */