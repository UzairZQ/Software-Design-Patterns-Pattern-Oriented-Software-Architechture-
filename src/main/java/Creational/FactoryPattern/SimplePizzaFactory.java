package Creational.FactoryPattern;

/**
 * SIMPLE FACTORY: The Factory
 * 
 * The main goal of a Factory is to handle object creation in one place.
 * This way, if you add a new type of Pizza (like "Pepperoni"), 
 * you only have to change the code HERE, not in every store that orders pizza.
 */
public class SimplePizzaFactory {

    /**
     * This method encapsulates the "new" keyword for Pizza objects.
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        // The "messy" creation logic is hidden inside this method.
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        
        return pizza;
    }
}
