import java.util.Random;

public class Item {
    String name;
    int weight;
    Rocket rocket = new Rocket();  // creates "Rocket" object to access "Rocket" class in "Simulation.java" java file
    public static class Rocket implements Spaceship {
        public boolean launch(int rocketWeight, int maxWeight){ // indicates if "launch" was Successful or Not
            return true;
        }
        public boolean land(int rocketWeight, int maxWeight){ // indicates if "land" was Successful or Not through "launch" result
            return true;
        }
        public boolean canCarry(int weight, int max_weight){ // checks if total rocket weight exceeds maximum weight limit
            if (weight <= max_weight){
                return true;
            }
            else {
                return false;
            }
        }
        public int carry(int num, int weight){ // updates current weight
            weight += num;
            return weight;
        }
    }
    public interface Spaceship {
        boolean launch(int rocketWeight, int maxWeight); // indicates if "launch" was Successful or Not
        boolean land(int rocketWeight, int maxWeight); // indicates if "land" was Successful or Not through "launch" result
        boolean canCarry(int weight, int max_weight);
        int carry(int num, int weight); // updates current weight
    }
    public class U1 extends Rocket{
        // Override "launch" method in "Rocket" class
        @Override
        public boolean launch(int rocketWeight, int maxWeight) { // Determines if rocket will crash, explode, or neither
            // Calculates Launch Failure Percentage
            double failureChance = 0.05 * ((double) rocketWeight / maxWeight); // 5% * (cargo carried / cargo limit)

            // Indicates if "launch" was Successful or Not
            if (Math.random() <= failureChance) {
                return true;
            } else {
                return false;
            }
        }

        // Override "land" method in "Rocket" class
        @Override
        public boolean land(int rocketWeight, int maxWeight) { // Determines if rocket will crash, explode, or neither
            // Calculates Land Failure Percentage
            double failureChance = 0.01 * ((double) rocketWeight / maxWeight); // 1% * (cargo carried / cargo limit)

            // Indicates if "land" was Successful or Not through "launch" result
            if (Math.random() <= failureChance) {
                return true;
            } else {
                return false;
            }
        }
    }
    public class U2 extends Rocket{
        // Override "launch" method in "Rocket" class
        @Override
        public boolean launch(int rocketWeight, int maxWeight) { // Determines if rocket will crash, explode, or neither
            // Calculates Launch Failure Percentage
            double failureChance = 0.04 * ((double) rocketWeight / maxWeight); // 4% * (cargo carried / cargo limit)

            // Indicates if "launch" was Successful or Not
            if (Math.random() <= failureChance) {
                return true;
            } else {
                return false;
            }
        }

        // Override "land" method in "Rocket" class
        @Override
        public boolean land(int rocketWeight, int maxWeight) { // Determines if rocket will crash, explode, or neither
            // Calculates Land Failure Percentage
            double failureChance = 0.08 * ((double) rocketWeight / maxWeight); // 8% * (cargo carried / cargo limit)

            // Indicates if "land" was Successful or Not through "launch" result
            if (Math.random() <= failureChance) {
                return true;
            } else {
                return false;
            }
        }
    }
}
