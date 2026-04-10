import java.util.HashSet;

public class TrainConsistManagementAppUC03 {

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 2. Create HashSet for Bogie IDs (ensures uniqueness)
        HashSet<String> bogieIds = new HashSet<>();

        System.out.println("\nAdding bogie IDs...");

        // 3. Add Bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate
        bogieIds.add("BG104");

        // 4. Display Unique Bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");

        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Program continues...
        System.out.println("\nNote: Duplicate IDs were automatically ignored.");
        System.out.println("Program completed successfully.");
    }
}