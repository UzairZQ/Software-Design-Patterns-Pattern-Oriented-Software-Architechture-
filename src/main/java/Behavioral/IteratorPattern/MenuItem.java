package Behavioral.IteratorPattern;

/**
 * ITERATOR PATTERN: The Data Object
 * 
 * A simple class to hold the information for one menu item.
 */
public class MenuItem {
    String name;
    double price;

    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}
