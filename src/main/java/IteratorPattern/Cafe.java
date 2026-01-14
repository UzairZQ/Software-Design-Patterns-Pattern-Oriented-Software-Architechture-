package IteratorPattern;

import java.util.Arrays;

public class Cafe {
    public static void main(String args[]) {
        // 1. Instantiate the concrete menus
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        // 2. Pass them as a list to the Waitress (Dependency Injection)
        Waitress waitress = new Waitress(Arrays.asList(pancakeHouseMenu, dinerMenu));

        // 3. The Waitress iterates over them without knowing their internal structure
        waitress.printMenu();
    }
}