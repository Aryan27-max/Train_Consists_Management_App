import java.util.ArrayList;
import java.util.List;

// Main Application Class
public class TrainConsistManagementApp {

    // Base Bogie Class (can be extended later)
    static class Bogie {
        private String type;

        public Bogie(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 2. Initialize Train Consist (Empty List)
        List<Bogie> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized.");

        // 3. Display Initial Bogie Count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // 4. Display Consist Summary
        System.out.println("\n--- Train Consist Summary ---");

        if (trainConsist.isEmpty()) {
            System.out.println("No bogies attached to the train.");
        } else {
            for (int i = 0; i < trainConsist.size(); i++) {
                System.out.println((i + 1) + ". " + trainConsist.get(i).getType());
            }
        }

        // Program continues...
        System.out.println("\nProgram is ready for further operations...");
    }
}