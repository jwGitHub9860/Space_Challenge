import java.io.File;
import java.io.IOException;
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
        ArrayList<Integer> u1RocketWeights = new ArrayList<Integer>(); // holds weights of each U-1 rocket needed
        ArrayList<Integer> u2Rockets = new ArrayList<Integer>();
        ArrayList<Integer> u2RocketWeights = new ArrayList<Integer>(); // holds weights of each U-2 rocket needed

        // Cost for each Rocket
        int u1Cost = 100000000; // U-1 rocket cost in $
        int u2Cost = 120000000; // U-2 rocket cost in $

        // Create Doubles for rocket budgets
        double u1BudgetTotal = 0;
        double u2BudgetTotal = 0;

        Simulation.loadItems(file1, file2, itemList); // calls "loadItems" method
        Simulation.loadU1(itemList, u1Rockets, u1RocketWeights); // calls "loadU1" method
        Simulation.loadU2(itemList, u2Rockets, u2RocketWeights); // calls "loadU2" method
        u1BudgetTotal = Simulation.runSimulation(u1Cost,18000, u1RocketWeights, u1BudgetTotal); // calls "runSimulation" method
        u2BudgetTotal = Simulation.runSimulation(u2Cost,29000, u2RocketWeights, u2BudgetTotal); // calls "runSimulation" method

        System.out.println("U-1 Total Budget: $" + u1BudgetTotal); // displays U-1 Total Budget
        System.out.println("U-2 Total Budget: $" + u2BudgetTotal); // displays U-2 Total Budget
    }
}