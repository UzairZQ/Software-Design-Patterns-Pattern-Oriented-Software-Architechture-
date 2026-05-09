package IteratorPattern;

import java.util.List;

/**
 * ITERATOR PATTERN: The Client
 * 
 * The Waitress is our client. She needs to print items from different menus.
 * Some menus might use an ArrayList, while others use a plain Array.
 * 
 * Without the Iterator, the Waitress would need two different 'for' loops 
 * and would need to know the internal structure of every menu.
 */
public class Waitress {
    List<Menu> menus;

    public Waitress(List<Menu> menus){
        this.menus = menus;
    }

    public void printMenu() {
        // We loop through all the different menus (Pancake, Diner, Cafe, etc.)
        for (Menu menu : menus) {
            // We ask EACH menu to give us an iterator. 
            // We don't care IF the menu uses an Array or an ArrayList!
            printMenu(menu.createIterator());
            System.out.println();
        }
    }

    /**
     * This method only knows about the 'Iterator' interface.
     * It uses hasNext() and next() to traverse the items uniformly.
     */
    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + " , " + menuItem.getPrice());
        }
    }
}
