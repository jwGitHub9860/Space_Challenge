import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) throws IOException { // if file CANNOT be opened
        Simulation simulation = new Simulation(); // access "Simulation.java" java file

        // Access "Phase-1" and "Phase-2" text files
        File file1 = new File("C:\\Users\\jwori\\JavaProjects\\Phase-1.txt"); // access "Phase-1" text file
        File file2 = new File("C:\\Users\\jwori\\JavaProjects\\Phase-2.txt"); // access "Phase-2" text file
        final RandomAccessFile phase1 = new RandomAccessFile(file1, "r"); // creates a random access file stream to read from
        final RandomAccessFile phase2 = new RandomAccessFile(file2, "r"); // creates a random access file stream to read from

        System.out.printf("(" + simulation.test + "," + Simulation.test2 + ")"); // TESTING CODE

        Item item = new Item(); // TESTING CODE
        System.out.println("result: " + item.weight); // TESTING CODE
    }
}