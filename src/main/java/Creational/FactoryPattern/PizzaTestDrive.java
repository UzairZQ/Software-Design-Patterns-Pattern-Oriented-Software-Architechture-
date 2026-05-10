package Creational.FactoryPattern;

/**
 * SIMPLE FACTORY: The Simulator
 * 
 * We create the factory, give it to the store, and then 
 * use the store to order different pizzas.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        // 1. Setup the factory and store
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        // 2. Order a pizza. The store uses the factory internally!
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We just received a " + pizza.getName() + "!\n");

        // 3. Order a different type
        pizza = store.orderPizza("veggie");
        System.out.println("We just received a " + pizza.getName() + "!");
    }
}