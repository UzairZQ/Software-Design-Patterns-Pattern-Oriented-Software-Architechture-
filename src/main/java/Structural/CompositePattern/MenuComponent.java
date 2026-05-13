package Structural.CompositePattern;

/**
 * COMPOSITE PATTERN: The Component
 * 
 * This abstract class defines the interface for all objects in the tree,
 * both the leaves (MenuItems) and the composites (Menus).
 * 
 * We provide default implementations that throw UnsupportedOperationException 
 * so that children only override the methods that make sense for them.
 */
public abstract class MenuComponent {

    // Composite Methods (Adding/Removing children)
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // Operation Methods (Getting info)
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    // The shared operation
    public void print() {
        throw new UnsupportedOperationException();
    }
}
