import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementAppUC06 {

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC6 - Map Bogie to Capacity");

        // 2. Create HashMap for Bogie-Capacity Mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println("\nAdding bogie capacities...");

        // 3. Insert Data using put()
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 50);
        bogieCapacityMap.put("First Class", 24);

        // 4. Display Bogie Capacities using entrySet()
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogie = entry.getKey();
            int capacity = entry.getValue();

            System.out.println(bogie + " -> Capacity: " + capacity);
        }

        // Program continues...
        System.out.println("\nUC6 mapping operations completed...");
    }
}