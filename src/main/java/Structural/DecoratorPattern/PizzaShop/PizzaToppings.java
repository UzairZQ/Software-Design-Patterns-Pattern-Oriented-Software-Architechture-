package Structural.DecoratorPattern.PizzaShop;

/**
 * DECORATOR PATTERN: The Decorator Base Class
 */
public abstract class PizzaToppings extends Pizza {
    // Every topping "has-a" pizza that it is decorating.
    Pizza pizza;
    public abstract String getDescription();
}
