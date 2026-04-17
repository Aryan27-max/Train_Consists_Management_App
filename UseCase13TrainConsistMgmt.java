import java.util.*;
import java.util.stream.*;

public class UseCase13TrainConsistMgmt {

    // Bogie model
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("=================================================\n");

        // Create large test dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0) {
                bogies.add(new Bogie("Passenger", 50 + (i % 100)));
            } else {
                bogies.add(new Bogie("Goods", 40 + (i % 120)));
            }
        }

        // -------------------------------
        // Loop-based filtering
        // -------------------------------
        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // -------------------------------
        // Stream-based filtering
        // -------------------------------
        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // -------------------------------
        // Output results
        // -------------------------------
        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        // Validate both results are same
        System.out.println("\nResult Consistency Check:");
        if (loopResult.size() == streamResult.size()) {
            System.out.println("✅ Loop and Stream results MATCH");
        } else {
            System.out.println("❌ Results DO NOT match");
        }

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}