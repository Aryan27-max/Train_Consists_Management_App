import java.util.LinkedList;

public class TrainConsistManagementAppUC04 {

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");

        // 2. Create LinkedList for Train Consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // 3. Add Initial Bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // 4. Display Initial Consist
        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // 5. Insert Pantry Car at Position 2 (index 2)
        System.out.println("\nInserting 'Pantry Car' at position 2...");
        trainConsist.add(2, "Pantry Car");

        System.out.println("After Insertion:");
        System.out.println(trainConsist);

        // 6. Remove First and Last Bogie
        System.out.println("\nRemoving first and last bogie...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 7. Final Consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        // Program end
        System.out.println("\nUC4 ordered consist operations completed...");
    }
}