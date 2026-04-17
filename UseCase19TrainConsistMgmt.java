import java.util.Arrays;

public class UseCase19TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("=================================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Ensure array is sorted (precondition)
        Arrays.sort(bogieIds);

        // Search key
        String key = "BG309";

        // Display sorted bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // ---- BINARY SEARCH LOGIC ----
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = key.compareTo(bogieIds[mid]);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp > 0) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        // Display result
        if (found) {
            System.out.println("\nBogie " + key + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + key + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}