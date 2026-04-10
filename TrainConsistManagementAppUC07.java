import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainConsistManagementApp {

    // Inner Bogie class
    static class Bogie {
        String name;
        int capacity;

        // Constructor
        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        // Display method
        @Override
        public String toString() {
            return name + " -> Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("------------------------------------------\n");

        // 2. Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // 3. Add Bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // 4. Display Before Sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 5. Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 6. Display After Sorting
        System.out.println("\nAfter Sorting (by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Program continues...
        System.out.println("\nUC7 sorting completed successfully...");
    }
}