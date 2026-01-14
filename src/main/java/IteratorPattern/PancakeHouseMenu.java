package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

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
        // We wrap the existing ArrayList iterator in our custom Iterator interface
        return new PancakeHouseIterator(menuItems);
    }
}
