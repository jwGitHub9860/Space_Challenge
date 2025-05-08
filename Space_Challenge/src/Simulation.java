import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Simulation {
    Item item = new Item(); // creates "Items" object to access "Item.java" java file
    public static void loadItems(File file1, File file2) throws IOException {
        // Reads data in "Phase-1" and "Phase-2" text files
        final RandomAccessFile phase1 = new RandomAccessFile(file1, "r"); // creates a random access file stream to read from
        final RandomAccessFile phase2 = new RandomAccessFile(file2, "r"); // creates a random access file stream to read from
        phase1.readLine(); // reads data in "Phase-1" text files (need because First line read does NOT have whole item)
        phase2.readLine(); // reads data in "Phase-2" text files (need because First line read does NOT have whole item)
        String rocket1_item = phase1.readLine(); // reads data in "Phase-1" text files
        String rocket2_item = phase2.readLine(); // reads data in "Phase-2" text files

        // Create ArrayLists for rockets
        ArrayList<String> rocket1 = new ArrayList<String>();
        ArrayList<String> rocket2 = new ArrayList<String>();

        // Reads data in "Phase-1" and "Phase-2" text files
        String line;
        while ((line = phase1.readLine()) != null) {
            System.out.println(line); // TESTING CODE
            rocket1.add(line); // adds data from "Phase-1" text file to "rocket1" array list
        }

        for (String data : rocket1){ //
            System.out.printf("text file test: " + phase1 + "\n"); // TESTING CODE
        }
        for (String data : rocket2){ //
            System.out.printf("text file test: " + data + "\n"); // TESTING CODE
        }
    }
}
