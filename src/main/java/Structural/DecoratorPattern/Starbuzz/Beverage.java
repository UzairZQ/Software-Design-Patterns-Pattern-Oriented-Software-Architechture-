package Structural.DecoratorPattern.Starbuzz;

/**
 * DECORATOR PATTERN: The Abstract Component
 * 
 * This is the base class for all beverages in the shop.
 * Both the concrete beverages (like Espresso) and the decorators (like Mocha)
 * will inherit from this class.
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    /**
     * Every beverage must implement its own cost method.
     */
    public abstract double cost();
}
