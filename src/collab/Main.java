package collab;
/**
 *
 * @author savi
 */

// Launcher for application
public class Main {
    public static void main(String args[]) {
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model, "Controller 1", 40, 50); // Create first controller
        Controller2 c2 = new Controller2(model, "Controller 2", 40, 200); // Create second controller
        Controller2 c3 = new Controller2(model, "Controller 3", 40, 350); // Create third controller
        Controller2 c4 = new Controller2(model, "Controller 4", 40, 500); // Create fourth controller
        Controller2 c5 = new Controller2(model, "Controller 5", 40, 650); // Create fifth controller
    } // main
} // Main
