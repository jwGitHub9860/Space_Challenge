import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Simulation {
    Item item = new Item(); // creates "Items" object to access "Item.java" java file
    public ArrayList<String> loadItems(File file1, File file2) throws IOException {
        // Reads data in "Phase-1" and "Phase-2" text files
        final RandomAccessFile phase1 = new RandomAccessFile(file1, "r"); // creates a random access file stream to read from
        final RandomAccessFile phase2 = new RandomAccessFile(file2, "r"); // creates a random access file stream to read from

        // Create ArrayLists for rockets
        ArrayList<String> itemList = new ArrayList<String>();

        // Reads data in "Phase-1" and "Phase-2" text files
        String line;
        while ((line = phase1.readLine()) != null) {
            itemList.add(line); // adds data from "Phase-1" text file to "itemList" array list
        }
        while ((line = phase2.readLine()) != null) {
            itemList.add(line); // adds data from "Phase-1" text file to "itemList" array list
        }

        System.out.println("itemList:"); // TESTING CODE
        for (String data : itemList){ //
            System.out.printf(data + "\n"); // TESTING CODE
        }
        System.out.println("\nitemList:"); // TESTING CODE
        for (String data : itemList){ //
            System.out.printf(data + "\n"); // TESTING CODE
        }
    }
}
