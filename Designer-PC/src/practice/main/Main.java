package practice.main;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import practice.userInterface.UserInterface;

/**
 * The main class responsible for starting the application.
 */
public class Main {
    /**
     * The entry point of the application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Initialize the user interface
        UserInterface userInterface = new UserInterface();
        // Display the guest menu
        userInterface.guestMenu();
    }
}
