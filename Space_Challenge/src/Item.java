public class Item {
    String name;
    int weight;
    public interface Space {
        static boolean launch(Simulation simulation){ // MUST BE "static boolean" NOT "boolean static" or Error will occur
            if (simulation.test == 10){ // indicates if launch was Successful or Not   MUST if STATEMENT CONDITION
                return true;
            }
            else{
                return false;
            }
        };
    }
}
