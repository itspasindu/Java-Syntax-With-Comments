import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> availableCars = new ArrayList<>();
        ArrayList<String> rentedCars = new ArrayList<>();
        HashMap<String, Double> carPrices = new HashMap<>();

        availableCars.add("Toyota Corolla");
        availableCars.add("Honda Civic");
        availableCars.add("Ford Focus");
        availableCars.add("BMW 3 Series");

        carPrices.put("Toyota Corolla", 60.0);
        carPrices.put("Honda Civic", 100.0);
        carPrices.put("Ford Focus", 120.0);
        carPrices.put("BMW 3 Series", 150.0);

        while(true){
            System.out.println("\nCar Rental System - JAVA");
            System.out.println("01- Rent a Car");
            System.out.println("02- Return a Car");
            System.out.println("03- View Prices");
            System.out.println("04- View Available Cars");
            System.out.println("05- Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                if (availableCars.isEmpty()){
                    System.out.println("No cars available for rent.");
                }
                else {
                    System.out.println("Available Cars: ");
                    for (int i = 0; i < availableCars.size(); i++){
                        System.out.println((i+1) + "." + availableCars.get(i));
                    }
                }
                System.out.println("Enter Car Number to Rent: ");
                int carChoice = scanner.nextInt();
                scanner.nextLine();

                if (carChoice > 0 && carChoice <= availableCars.size()){
                    String rentedCar = availableCars.remove(carChoice - 1);
                    rentedCars.add(rentedCar);
                    System.out.println("You have rented " + rentedCar);
                }
                else {
                    System.out.println("Invalid choice");
                }

            }
            break;
        }
        
    }
}
