import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simulation {
    Item item = new Item(); // creates "Items" object to access "Item.java" java file
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
    public static ArrayList<String> loadU1(ArrayList<String> itemList, ArrayList<String> u1Rockets) {
        // Make pattern to match integers
        Pattern pattern = Pattern.compile("\\d+"); // COMPILES pattern "\\d+" - pattern used to Only Find Integers
        Matcher matcher = pattern.matcher((CharSequence) itemList); // CREATES pattern for Matching & use (CharSequence) because "itemList" is an array list

        // Extract ONLY ITEM WEIGHT AMOUNTS
        while (matcher.find()){
            u1Rockets.add(String.valueOf(Integer.parseInt(matcher.group())));
        }

        // Checks if U-1 Rocket exceeded its Max weight
        /*if (item.weight > 18000){ // USE DIVIDE EQUATION
            //
        }*/
        return u1Rockets;
    }
}
