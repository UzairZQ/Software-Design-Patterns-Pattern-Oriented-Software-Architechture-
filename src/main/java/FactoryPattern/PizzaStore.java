package FactoryPattern;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        // Use the factory to create the pizza
        Pizza pizza = factory.createPizza(type);

        // Process the pizza
        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }
}
