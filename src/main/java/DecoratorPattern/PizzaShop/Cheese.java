package DecoratorPattern.PizzaShop;

/**
 * DECORATOR PATTERN: A Concrete Decorator (Topping)
 */
public class Cheese extends PizzaToppings {

    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){
        return pizza.getDescription() + " With Cheese";
    }

    public double cost(){
        // Add $1.99 for cheese
        return pizza.cost() + 1.99;
    }
}
