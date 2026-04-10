import java.util.ArrayList;

public class TrainConsistManagementAppUC02 {

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 2. Create ArrayList for Passenger Bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        System.out.println("\nAdding passenger bogies...");

        // 3. Add Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 4. Display After Insertion
        System.out.println("\nPassenger Bogies after addition:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // 5. Remove a Bogie (AC Chair)
        System.out.println("\nRemoving 'AC Chair' bogie...");
        passengerBogies.remove("AC Chair");

        // 6. Check if Sleeper Exists
        System.out.println("\nChecking if 'Sleeper' exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present in the train.");
        }

        // 7. Final List State
        System.out.println("\nFinal Passenger Bogies:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Program continues...
        System.out.println("\nProgram completed successfully.");
    }
}