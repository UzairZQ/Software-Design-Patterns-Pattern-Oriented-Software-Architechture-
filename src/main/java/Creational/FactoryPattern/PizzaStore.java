package Creational.FactoryPattern;

/**
 * SIMPLE FACTORY: The Client
 * 
 * The PizzaStore is the client of the factory. 
 * It doesn't care HOW the pizza is created; it just wants a Pizza object.
 * 
 * This is called "decoupling". The store is no longer tied to 
 * concrete classes like CheesePizza or VeggiePizza.
 */
public class PizzaStore {
    
    // The store HAS-A factory
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        // Instead of using 'new CheesePizza()', we ask the factory.
        Pizza pizza = factory.createPizza(type);

        // Every pizza goes through the same process once it's created.
        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }
}
