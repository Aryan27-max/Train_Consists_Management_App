import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainConsistManagementAppUC09 {

    // Reusing Bogie class
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("------------------------------------------------\n");

        // 2. Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));      // duplicate type
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));     // duplicate type

        // 3. Display Original List
        System.out.println("Original Bogie List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 4. Group Bogies using Stream + groupingBy
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // 5. Display Grouped Result
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        // 6. Verify original list unchanged
        System.out.println("\nOriginal list size remains: " + bogies.size());

        // Program continues...
        System.out.println("\nUC9 grouping completed successfully...");
    }
}