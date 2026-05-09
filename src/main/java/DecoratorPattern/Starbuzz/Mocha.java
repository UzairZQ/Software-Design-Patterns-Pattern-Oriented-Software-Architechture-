package DecoratorPattern.Starbuzz;

/**
 * DECORATOR PATTERN: A Concrete Decorator
 * 
 * This class "wraps" a Beverage object.
 */
public class Mocha extends CondimentDecorator {

    // The beverage being decorated
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    /**
     * When asked for the description, we ask the beverage we're wrapping 
     * for ITS description, and then add "Mocha" to it.
     */
    @Override
    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * When asked for the cost, we ask the beverage we're wrapping 
     * for ITS cost, and then add the cost of Mocha ($0.20) to it.
     */
    @Override
    public double cost(){
        return beverage.cost() + .20;
    }
}
