import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementAppUC10 {

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
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("------------------------------------------------\n");

        // 2. Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // 3. Display Bogies
        System.out.println("Bogie List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 4. Calculate Total Capacity using Stream API
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        // 5. Display Total
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        // Verify original list unchanged
        System.out.println("\nOriginal list size remains: " + bogies.size());

        // Program continues...
        System.out.println("\nUC10 aggregation completed successfully...");
    }
}