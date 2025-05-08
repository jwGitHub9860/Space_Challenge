import java.util.Random;

public class Item {
    String name;
    int weight;
    public class Rocket implements Spaceship {
        int test5 = 10; // TESTING CODE
        public boolean launch(Simulation simulation){ // indicates if "launch" was Successful or Not
            if (simulation.test == 10){ //  MUST if STATEMENT CONDITION
                return true;
            }
            else{
                return false;
            }
        }
        public boolean land(Simulation simulation){ // indicates if "land" was Successful or Not through "launch" result
            if (simulation.test == 10){ //  MUST if STATEMENT CONDITION
                return true;
            }
            else {
                return false;
            }
        }
        public boolean canCarry(Simulation simulation){
            if (simulation.test == 10){ //  MUST if STATEMENT CONDITION
                return true;
            }
            else {
                return false;
            }
        }
        public int carry(Item item){ // updates current weight
            return item.weight++;
        }
    }
    public interface Spaceship {
        boolean launch(Simulation simulation); // indicates if "launch" was Successful or Not
        boolean land(Simulation simulation); // indicates if "land" was Successful or Not through "launch" result
        boolean canCarry(Simulation simulation);
        int carry(Item item); // updates current weight
    }
    public class U1 extends Rocket{
        int cost = 100; // in Millions $
        int weight = 10; // Tonnes
        int max_weight = 18; // Tonnes (with cargo)
        int launch_explosion_chance = 5; // % * (cargo carried / cargo limit)
        int landing_crash_chance = 1; // % * (cargo carried / cargo limit)

        // Determines if "U-1" rocket will crash, explode, or neither
        Random r = new Random(); // creates "Random" object
        int result = r.nextInt(100) + 1; // "+ 1" ensures number will be within range of "0-100"
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
