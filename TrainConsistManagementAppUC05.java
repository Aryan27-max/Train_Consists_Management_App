import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");

        // 2. Create LinkedHashSet for Train Formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        System.out.println("\nAdding bogies to train formation...");

        // 3. Add Bogies (with intentional duplicate)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper"); // Duplicate (will be ignored)

        // 4. Display Final Formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);

        // 5. Explanation
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        // Program end
        System.out.println("\nUC5 formation setup completed...");
    }
}