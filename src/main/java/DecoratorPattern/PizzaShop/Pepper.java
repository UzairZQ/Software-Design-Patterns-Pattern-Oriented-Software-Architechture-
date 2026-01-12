package DecoratorPattern.PizzaShop;

public class Pepper extends  PizzaToppings{

Pizza pizza;
    public Pepper(Pizza pizza){
        this.pizza = pizza;
    }
    

public String getDescription(){

    return pizza.getDescription() + " With Strong Peppers";
}


public double cost(){

    return pizza.cost() + 0.49;
}
}
