package Structural.DecoratorPattern.Starbuzz;

/**
 * DECORATOR PATTERN: The Client
 * 
 * This class shows how we use decorators to build a complex object.
 * We start with a DarkRoast, then wrap it in Mocha, then another Mocha, 
 * and finally Whip.
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {

        // 1. Order a DarkRoast
        Beverage beverage = new DarkRoast();
        
        // 2. Decorate it with Mocha
        beverage = new Mocha(beverage);
        
        // 3. Decorate it with another Mocha (double Mocha!)
        beverage = new Mocha(beverage);
        
        // 4. Decorate it with Whip
        beverage = new Whip(beverage);

        // When we call getDescription() and cost(), the call travels 
        // through the whole chain of decorators!
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
    }
}
