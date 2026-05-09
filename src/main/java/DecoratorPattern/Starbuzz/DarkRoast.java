package DecoratorPattern.Starbuzz;

/**
 * DECORATOR PATTERN: A Concrete Component
 * 
 * This is a specific type of beverage. It's the "core" object 
 * that will be decorated with condiments.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        // The description is defined in the Beverage base class.
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost(){
        return .99;
    }
}
