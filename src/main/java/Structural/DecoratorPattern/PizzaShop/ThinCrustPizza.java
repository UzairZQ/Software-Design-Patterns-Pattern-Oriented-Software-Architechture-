package Structural.DecoratorPattern.PizzaShop;

/**
 * DECORATOR PATTERN: A Concrete Component
 */
public class ThinCrustPizza extends Pizza{

    public ThinCrustPizza() {
        description = "Thin Crust Pizza";
    }

    public double cost(){
        return 4.99;
    }
}
