package Structural.CompositePattern;

/**
 * COMPOSITE PATTERN: The Client
 * 
 * The Waitress doesn't care if she's printing a single item or a whole menu.
 * She just calls print() on the top-level MenuComponent.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
