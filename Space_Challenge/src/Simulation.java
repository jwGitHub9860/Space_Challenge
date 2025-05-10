import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Item i = new Item();
        // Extract ONLY ITEM WEIGHT AMOUNTS & put them in "u1Rockets"
        for (String line : itemList){
            String data = line.replaceAll("[^0-9]", ""); // MUST REMOVE Letters from String BEFORE PUTTING them into ArrayList<Integer> or Error Will Occur
            u1Rockets.add(Integer.parseInt(data));
        }

        // Checks if U-1 Rocket exceeded its Max weight
        int total_weight = 10000; // initial rocket weight total WITH WEIGHT OF ROCKET BY ITSELF
        for (int num : u1Rockets) {
            System.out.println("Weight start: " + total_weight); // TESTING CODE
            System.out.println("num: " + num); // TESTING CODE
            total_weight += item.rocket.carry(num, total_weight);
            System.out.println("Weight ADDED: " + total_weight); // TESTING CODE
            boolean allowCarry = item.rocket.canCarry(num, 10, 18000);
            System.out.println("Weight Allowed: " + total_weight); // TESTING CODE
            if (!allowCarry) {
                System.out.println("Weight Before: " + total_weight); // TESTING CODE
                total_weight -= num; // subtract weight that makes rocket weight exceed max weight
                System.out.println("Weight Subtracted: " + total_weight); // TESTING CODE
                u1RocketWeights.add(total_weight);
                System.out.println("Weight ADDED: " + total_weight); // TESTING CODE
                total_weight = 10000; // changes rocket weight total Back To INITIAL Weight
                System.out.println("Weight Original: " + total_weight + "\n"); // TESTING CODE
            }
        }
        System.out.println(u1RocketWeights); // TESTING CODE
        return u1Rockets;
    }
}
