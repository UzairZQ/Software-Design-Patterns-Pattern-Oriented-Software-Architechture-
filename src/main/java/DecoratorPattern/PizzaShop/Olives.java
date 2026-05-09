package DecoratorPattern.PizzaShop;

/**
 * DECORATOR PATTERN: A Concrete Decorator (Topping)
 */
public class Olives extends PizzaToppings {

    public Olives(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){
        return pizza.getDescription() + " With Premium Olives";
    }
    
    public double cost(){
        // Add $0.99 for olives
        return pizza.cost() + 0.99;
    }
}
