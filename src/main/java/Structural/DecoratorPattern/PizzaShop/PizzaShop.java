package Structural.DecoratorPattern.PizzaShop;

/**
 * DECORATOR PATTERN: The Client
 */
public class PizzaShop {
    public static void main(String[] args) {
        // 1. Start with a simple pizza
        Pizza thinPizza = new ThinCrustPizza();
        
        // 2. Wrap it in multiple decorators (toppings)
        thinPizza = new Cheese(thinPizza);
        thinPizza = new Pepper(thinPizza);
        thinPizza = new Olives(thinPizza);

        // 3. Output the final description and total cost
        System.out.println(thinPizza.getDescription() + " $ " + thinPizza.cost());
    }
}
