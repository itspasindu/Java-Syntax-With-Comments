import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int roomNumber = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.println("Please Enter Your NIC Number: ");
        String NIC = scanner.nextLine();

        System.out.println("Please Choose Your Hotel Room Type (single, double, family): ");
        String roomType = scanner.nextLine().toLowerCase();

        System.out.println("Please Enter Your Room Number: ");
        roomNumber = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        System.out.println("Please Enter Your Check-In Date: ");
        String checkInDate = scanner.nextLine();

        System.out.println("Please Enter Your Check-Out Date: ");
        String checkOutDate = scanner.nextLine();

        switch (roomType) {
            case "single":
                processRoom("Single", 100);
                break;
            case "double":
                processRoom("Double", 200);
                break;
            case "family":
                processRoom("Family", 300);
                break;
            default:
                System.out.println("Invalid Room Type");
                break;
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }

    private static void processRoom(String roomType, int price) {
        System.out.println("Your room type is: " + roomType + " and the price is: " + price + " USD per night.");
    }
}
