package Behavioral.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ITERATOR PATTERN: A Concrete Aggregate
 * 
 * This menu uses an ArrayList to store its items.
 */
public class PancakeHouseMenu implements Menu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast", 2.99);
        addItem("Regular Pancake Breakfast", 2.99);
        addItem("Blueberry Pancakes", 3.49);
    }

    public void addItem(String name, double price) {
        MenuItem menuItem = new MenuItem(name, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        // We wrap the existing List in our custom PancakeHouseIterator
        return new PancakeHouseIterator(menuItems);
    }
}
