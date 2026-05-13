package Structural.CompositePattern;

/**
 * COMPOSITE PATTERN: The Test Drive
 * 
 * Here we assemble the tree:
 * All Menus -> (Pancake Menu, Diner Menu, Cafe Menu)
 * Diner Menu -> (Standard Items, Dessert Sub-Menu)
 */
public class MenuTestDrive {
    public static void main(String args[]) {
        // 1. Create the menus
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        // 2. Create the top-level container
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        // 3. Assemble the tree
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // 4. Add items to Pancake House Menu
        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));

        // 5. Add items to Diner Menu
        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Faking) Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce", true, 3.89));

        // 6. Add the Dessert SUB-MENU to the Diner Menu! (This is the Composite power)
        dinerMenu.add(dessertMenu);

        // 7. Add items to the Sub-Menu
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));
        dessertMenu.add(new MenuItem("Cheesecake", "Creamy New York cheesecake, with a graham cracker crust", true, 1.99));

        // 8. Give the waitress the top-level component
        Waitress waitress = new Waitress(allMenus);

        // 9. One call to rule them all!
        waitress.printMenu();
    }
}
