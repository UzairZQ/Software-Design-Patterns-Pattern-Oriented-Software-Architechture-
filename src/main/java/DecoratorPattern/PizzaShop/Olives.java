package DecoratorPattern.PizzaShop;


public class Olives extends PizzaToppings {

Pizza pizza;
    public Olives(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){

        return pizza.getDescription() + " With Premium Olives";
    }
    
    public double cost(){

        return pizza.cost() + 0.99;
    }
    
}
