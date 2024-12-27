import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hotel Reservation System");
        System.out.print("Please enter the number of rooms you would like to reserve: ");
        int numRooms = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter the number of nights you would like to reserve the rooms for: ");
        int numNights = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter the number of guests: ");
        int numGuests = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter the number of beds: ");
        int numBeds = scanner.nextInt();
        scanner.nextLine();

        String checkInDate = "", checkOutDate = "";

        // Get Check-In Date
        while (checkInDate == null || checkInDate.trim().isEmpty()) {
            System.out.print("Please enter the check-in date (e.g., 2024-12-27): ");
            checkInDate = scanner.nextLine().trim();

            if (checkInDate.isEmpty()) {
                System.out.println("Check-in date is required. Please try again.");
            }
        }

        // Get Check-Out Date
        while (checkOutDate == null || checkOutDate.trim().isEmpty()) {
            System.out.print("Please enter the check-out date (e.g., 2024-12-28): ");
            checkOutDate = scanner.nextLine().trim();

            if (checkOutDate.isEmpty()) {
                System.out.println("Check-out date is required. Please try again.");
            }
        }

        int roomType = 0;
        while (roomType != 1 && roomType != 2) {
            System.out.println("Please select your room type:");
            System.out.println("1- A/C Room | 2- Non A/C Room");
            roomType = scanner.nextInt();
            if (roomType != 1 && roomType != 2) {
                System.out.println("Invalid option. Please select 1 or 2.");
            }
        }

        scanner.close();

        // Capture the total returned from roomProcess
        int total = roomProcess(numRooms, numNights, numGuests, numBeds, roomType);
        receipt(checkInDate, checkOutDate, numRooms, numNights, numGuests, numBeds, roomType, total);
    }

    private static int roomProcess(int numRooms, int numNights, int numGuests, int numBeds, int roomType) {
        int price = 0;

        switch (roomType) {
            case 1:
                price = 100; // Price for A/C Room
                break;

            case 2:
                price = 50; // Price for Non A/C Room
                break;
        }

        int total = price * numRooms * numNights;
        System.out.println("The total price for " + numRooms + " rooms for " + numNights + " night(s) is $" + total);
        return total; // Return the total price
    }

    private static void receipt(String checkInDate, String checkOutDate, int numRooms, int numNights, int numGuests, int numBeds, int roomType, int total) {
        System.out.println("Receipt");
        System.out.println("Check-In Date: " + checkInDate);
        System.out.println("Check-Out Date: " + checkOutDate);
        System.out.println("Number of Rooms: " + numRooms);
        System.out.println("Number of Nights: " + numNights);
        System.out.println("Number of Guests: " + numGuests);
        System.out.println("Number of Beds: " + numBeds);
        System.out.println("Room Type: " + (roomType == 1 ? "A/C Room" : "Non A/C Room"));
        System.out.println("Total: $" + total);
    }
}