package Behavioral.IteratorPattern;

import java.util.Arrays;

/**
 * ITERATOR PATTERN: The Main Simulation
 */
public class Cafe {
    public static void main(String args[]) {
        // 1. Create the concrete menus
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        // 2. Pass them as a list to the Waitress
        Waitress waitress = new Waitress(Arrays.asList(pancakeHouseMenu, dinerMenu));

        // 3. The Waitress can now print ALL menus using a single logic!
        waitress.printMenu();
    }
}