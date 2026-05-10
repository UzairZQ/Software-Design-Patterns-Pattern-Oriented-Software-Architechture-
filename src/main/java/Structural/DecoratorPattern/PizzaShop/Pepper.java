package Structural.DecoratorPattern.PizzaShop;

/**
 * DECORATOR PATTERN: A Concrete Decorator (Topping)
 */
public class Pepper extends PizzaToppings{

    public Pepper(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){
        return pizza.getDescription() + " With Strong Peppers";
    }

    public double cost(){
        // Add $0.49 for peppers
        return pizza.cost() + 0.49;
    }
}
