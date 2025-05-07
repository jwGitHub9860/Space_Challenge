public class Item {
    String name;
    int weight;
    public interface Spaceship {
        static boolean launch(Simulation simulation){ // indicates if "launch" was Successful or Not    MUST BE "static boolean" NOT "boolean static" or Error will occur
            if (simulation.test == 10){ //  MUST if STATEMENT CONDITION
                return true;
            }
            else{
                return false;
            }
        }
        static boolean land(Simulation simulation){ // indicates if "land" was Successful or Not through "launch" result
            if (simulation.test == 10){ //  MUST if STATEMENT CONDITION
                return true;
            }
            else {
                return false;
            }
        }
        static boolean canCarry(Simulation simulation){
            if (simulation.test == 10){ //  MUST if STATEMENT CONDITION
                return true;
            }
            else {
                return false;
            }
        }
    }
}
