import java.util.*;

public class UseCase12TrainConsistMgmt {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Cargo: " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("=================================================\n");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        // Uncomment below to test violation
        // goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Display bogies
        System.out.println("Goods Bogies List:");
        goodsBogies.forEach(System.out::println);

        // Safety validation using Stream + allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(bogie ->
                        !bogie.type.equalsIgnoreCase("Cylindrical") ||
                        bogie.cargo.equalsIgnoreCase("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Compliance Status:");
        if (isSafe) {
            System.out.println("✅ Train is SAFE for operation");
        } else {
            System.out.println("❌ Train is NOT SAFE - Rule violation detected");
        }
    }
}