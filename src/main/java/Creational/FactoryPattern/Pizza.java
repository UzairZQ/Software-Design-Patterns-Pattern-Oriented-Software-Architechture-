package Creational.FactoryPattern;

/**
 * SIMPLE FACTORY: The Abstract Product
 * 
 * This is the base class for all pizzas. Every pizza we create using 
 * the factory will be a subclass of this.
 */
public abstract class Pizza {
    String name;

    public void prepare() { 
        System.out.println("Preparing " + name); 
    }

    public void bake() { 
        System.out.println("Baking " + name); 
    }

    public void box() { 
        System.out.println("Boxing " + name); 
    }

    public String getName() { 
        return name; 
    }
}