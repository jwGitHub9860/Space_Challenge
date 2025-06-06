import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Simulation {
    public static ArrayList<String> loadItems(File file1, File file2, ArrayList<String> itemList) throws IOException {
        // Reads data in "Phase-1" and "Phase-2" text files
        final RandomAccessFile phase1 = new RandomAccessFile(file1, "r"); // creates a random access file stream to read from
        final RandomAccessFile phase2 = new RandomAccessFile(file2, "r"); // creates a random access file stream to read from

        // Reads data in "Phase-1" and "Phase-2" text files
        String line;
        while ((line = phase1.readLine()) != null) {
            itemList.add(line); // adds data from "Phase-1" text file to "itemList" array list
        }
        while ((line = phase2.readLine()) != null) {
            itemList.add(line); // adds data from "Phase-1" text file to "itemList" array list
        }

        return itemList;
    }
    public static ArrayList<Integer> loadU1(ArrayList<String> itemList, ArrayList<Integer> u1Rockets, ArrayList<Integer> u1RocketWeights) {
        Item item = new Item(); // creates "Items" object to access "Item.java" java file

        // Extract ONLY ITEM WEIGHT AMOUNTS & put them in "u1Rockets"
        for (String line : itemList){
            String data = line.replaceAll("[^0-9]", ""); // MUST REMOVE Letters from String BEFORE PUTTING them into ArrayList<Integer> or Error Will Occur
            u1Rockets.add(Integer.parseInt(data));
        }

        // Checks if U-1 Rocket exceeded its Max weight
        int total_weight = 10000; // initial rocket weight total WITH WEIGHT OF ROCKET BY ITSELF
        for (int num : u1Rockets) {
            total_weight = item.rocket.carry(num, total_weight);
            boolean allowCarry = item.rocket.canCarry(total_weight, 18000);
            if (!allowCarry) {
                total_weight -= num; // subtract weight that makes rocket weight exceed max weight
                u1RocketWeights.add(total_weight);
                total_weight = 10000 + num; // changes rocket weight total Back To INITIAL Weight
            }
        }
        u1RocketWeights.add(total_weight); // adds last U-1 rocket weight to "u1RocketWeights"
        return u1RocketWeights;
    }
    public static ArrayList<Integer> loadU2(ArrayList<String> itemList, ArrayList<Integer> u2Rockets, ArrayList<Integer> u2RocketWeights) {
        Item item = new Item(); // creates "Items" object to access "Item.java" java file

        // Extract ONLY ITEM WEIGHT AMOUNTS & put them in "u2Rockets"
        for (String line : itemList){
            String data = line.replaceAll("[^0-9]", ""); // MUST REMOVE Letters from String BEFORE PUTTING them into ArrayList<Integer> or Error Will Occur
            u2Rockets.add(Integer.parseInt(data));
        }

        // Checks if U-2 Rocket exceeded its Max weight
        int total_weight = 18000; // initial rocket weight total WITH WEIGHT OF ROCKET BY ITSELF
        for (int num : u2Rockets) {
            total_weight = item.rocket.carry(num, total_weight);
            boolean allowCarry = item.rocket.canCarry(total_weight, 29000);
            if (!allowCarry) {
                total_weight -= num; // subtract weight that makes rocket weight exceed max weight
                u2RocketWeights.add(total_weight);
                total_weight = 18000 + num; // changes rocket weight total Back To INITIAL Weight
            }
        }
        u2RocketWeights.add(total_weight); // adds last U-2 rocket weight to "u2RocketWeights"
        return u2RocketWeights;
    }
    public static double runSimulation(int rocketCost, int maxWeight, ArrayList<Integer>rocketWeights, double rocketBudgetTotal){
        Item item = new Item(); // creates "Items" object to access "Item.java" java file
        boolean launchSuccess = false; // confirms if rocket launch was successful
        boolean landSuccess = false; // confirms if rocket landing was successful

        // Finds Total Rocket Budget
        for (int num : rocketWeights) {
            launchSuccess = item.rocket.launch(num, maxWeight); // calls "launch" method
            landSuccess = item.rocket.land(num, maxWeight); // calls "land" method

            rocketBudgetTotal += rocketCost; // adds rocket cost to total rocket budget

            // Relaunch rocket if it fails to launch or land
            while (!launchSuccess || !landSuccess){
                launchSuccess = item.rocket.launch(num, maxWeight); // calls "launch" method
                landSuccess = item.rocket.land(num, maxWeight); // calls "land" method
            }
        }
        return rocketBudgetTotal;
    }
}
