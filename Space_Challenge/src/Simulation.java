import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Simulation {
    Item item = new Item(); // creates "Items" object to access "Item.java" java file
    public static ArrayList<Integer> loadItems(File file1, File file2) throws IOException {
        final RandomAccessFile phase1 = new RandomAccessFile(file1, "r"); // creates a random access file stream to read from
        final RandomAccessFile phase2 = new RandomAccessFile(file2, "r"); // creates a random access file stream to read from
        //System.out.printf("text file test: " + test + "\n"); // TESTING CODE
    }
}
