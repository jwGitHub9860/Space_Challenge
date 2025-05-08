import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException { // if file CANNOT be opened
        Simulation simulation = new Simulation(); // creates "Simulation" object to access "Simulation.java" java file

        // Access "Phase-1" and "Phase-2" text files
        File file1 = new File("C:\\Users\\jwori\\JavaProjects\\Phase-1.txt"); // access "Phase-1" text file
        File file2 = new File("C:\\Users\\jwori\\JavaProjects\\Phase-2.txt"); // access "Phase-2" text file

        // Create ArrayLists for rockets
        ArrayList<String> itemList = new ArrayList<String>();
        ArrayList<Integer> u1Rockets = new ArrayList<Integer>();

        Simulation.loadItems(file1, file2, itemList); // calls "loadItems" method
        System.out.println("itemList:"); // TESTING CODE


        //System.out.println("result1: " + item.result1); // TESTING CODE
        //System.out.println("result2: " + item.result2 + "\n"); // TESTING CODE
    }
}