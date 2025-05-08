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
        ArrayList<String> rocket1 = new ArrayList<String>();
        ArrayList<String> rocket2 = new ArrayList<String>();

        // Reads data in "Phase-1" and "Phase-2" text files
        String line;
        while ((line = phase1.readLine()) != null) {
            rocket1.add(line); // adds data from "Phase-1" text file to "rocket1" array list
        }
        while ((line = phase2.readLine()) != null) {
            rocket2.add(line); // adds data from "Phase-1" text file to "rocket1" array list
        }

        System.out.println("rocket1:"); // TESTING CODE
        for (String data : rocket1){ //
            System.out.printf(data + "\n"); // TESTING CODE
        }
        System.out.println("\nrocket2:"); // TESTING CODE
        for (String data : rocket2){ //
            System.out.printf(data + "\n"); // TESTING CODE
        }
    }
}
