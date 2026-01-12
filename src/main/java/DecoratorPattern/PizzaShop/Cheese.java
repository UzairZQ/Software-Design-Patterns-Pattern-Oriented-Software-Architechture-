package DecoratorPattern.PizzaShop;


public class Cheese extends PizzaToppings {

Pizza pizza;

public Cheese(Pizza pizza){
    this.pizza = pizza;

}

public String getDescription(){

    return pizza.getDescription() + " With Cheese";
}

public double cost(){

    return pizza.cost() + 1.99;
}


}
