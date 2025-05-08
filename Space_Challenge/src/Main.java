import java.io.File;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation(); // access "Simulation.java" java file
        // Access "Phase-1" and "Phase-2" text files
        File file1 = new File("C:\\Users\\jwori\\JavaProjects\\Phase-1"); // access "Phase-1" text file
        File file2 = new File("C:\\Users\\jwori\\JavaProjects\\Phase-2"); // access "Phase-2" text file
        final RandomAccessFile phase1 = new RandomAccessFile(file1, "r"); // creates a random access file stream to read from
        final RandomAccessFile phase2 = new RandomAccessFile(file2, "r"); // creates a random access file stream to read from

        System.out.printf("(" + simulation.test + "," + Simulation.test2 + ")"); // TESTING CODE

        for (int i = 1; i <= 5; i++) {


            System.out.println("i = " + i);
        }
    }
}