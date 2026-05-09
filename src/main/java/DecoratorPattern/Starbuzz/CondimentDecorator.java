package DecoratorPattern.Starbuzz;

/**
 * DECORATOR PATTERN: The Decorator Base Class
 * 
 * Notice that it extends Beverage. This is NOT to inherit behavior, 
 * but to have the correct TYPE. The decorator needs to be interchangeable 
 * with the beverage it is decorating.
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * We force all condiment decorators to re-implement getDescription()
     * so they can add their own name to the description.
     */
    public abstract String getDescription();
}
