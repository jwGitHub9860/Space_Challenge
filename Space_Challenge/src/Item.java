public class Item {
    String name;
    int weight;
    public class Rocket implements Spaceship {
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
}
