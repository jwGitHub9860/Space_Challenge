import java.util.Random;

public class Item {
    String name;
    int weight;
    Rocket rocket = new Rocket();  // creates "Rocket" object to access "Rocket" class in "Simulation.java" java file
    public static class Rocket implements Spaceship {
        public boolean launch(){ // indicates if "launch" was Successful or Not
            return true;
        }
        public boolean land(){ // indicates if "land" was Successful or Not through "launch" result
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
        boolean launch(); // indicates if "launch" was Successful or Not
        boolean land(); // indicates if "land" was Successful or Not through "launch" result
        boolean canCarry(int weight, int max_weight);
        int carry(int num, int weight); // updates current weight
    }
    public class U1 extends Rocket{
        int launch_explosion_chance = 5; // % * (cargo carried / cargo limit)
        int landing_crash_chance = 1; // % * (cargo carried / cargo limit)

        // Override "launch" method in "Rocket" class
        @Override
        public boolean launch() {
            // Determines if "U-1" rocket will crash, explode, or neither
            Random r = new Random(); // creates "Random" object
            int random_num = r.nextInt(100) + 1; // "+ 1" ensures number will be within range of "0-100"

            // Indicates if "launch" was Successful or Not
            if (random_num < 5) { //  MUST if STATEMENT CONDITION
                return true;
            } else {
                return false;
            }
        }

        // Override "land" method in "Rocket" class
        @Override
        public boolean land() {
            // Determines if "U-1" rocket will crash, explode, or neither
            Random r = new Random(); // creates "Random" object
            int random_num = r.nextInt(100) + 1; // "+ 1" ensures number will be within range of "0-100"

            // Indicates if "land" was Successful or Not through "launch" result
            if (random_num == 1) { //  MUST if STATEMENT CONDITION
                return true;
            } else {
                return false;
            }
        }
    }
    public class U2 extends Rocket{
        int cost = 120; // in Millions $
        int weight = 18; // Tonnes
        int max_weight = 29; // Tonnes (with cargo)
        int launch_explosion_chance = 4; // % * (cargo carried / cargo limit)
        int landing_crash_chance = 8; // % * (cargo carried / cargo limit)

        // Determines if "U-2" rocket will crash, explode, or neither
        Random r = new Random(); // creates "Random" object
        int result = r.nextInt(100) + 1; // "+ 1" ensures number will be within range of "0-100"
    }
}
