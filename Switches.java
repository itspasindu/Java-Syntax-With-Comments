/*  Switch statement that allows a variable to be tested for equality against a list of values.
Break statement is used to terminate the switch statement.
If break statement is not used, the execution will continue on into the next case.
*/

public class Switches {
    public static void main(String[] args) {
        String day = "Tuesday"; 

        switch (day) {
            case "Sunday": System.out.println("It's Sunday!");
            break;
            case "Monday": System.out.println("It's Monday!");
            break;
            case "Tuesday": System.out.println("It's Tuesday!");
            break;
            case "Wednesday": System.out.println("It's Wednesday!");
            break;
            case "Thursday": System.out.println("It's Thursday!");
            break;
            case "Friday": System.out.println("It's Friday!");
            break;
            case "Saturday": System.out.println("It's Saturday!");
            break;
            default: System.out.println("Invalid day!"); // default case is optional and can be placed anywhere in the switch statement
        }

    }
}
