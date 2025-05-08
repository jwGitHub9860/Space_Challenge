import java.io.File;

public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation(); // access "Simulation.java" java file
        // Access "Phase-1" and "Phase-2" text files
        File file1 = new File("C:\\Users\\jwori\\JavaProjects\\Phase-1"); // access "Phase-1" text file
        File file2 = new File("C:\\Users\\jwori\\JavaProjects\\Phase-2"); // access "Phase-2" text file
        System.out.printf("(" + simulation.test + "," + Simulation.test2 + ")");

        for (int i = 1; i <= 5; i++) {

            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}