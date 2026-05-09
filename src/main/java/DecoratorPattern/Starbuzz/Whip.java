package DecoratorPattern.Starbuzz;

/**
 * DECORATOR PATTERN: A Concrete Decorator
 * 
 * This class "wraps" a Beverage object to add Whip to it.
 */
public class Whip extends CondimentDecorator  {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost(){
        // Add the cost of Whip ($0.10) to whatever we are wrapping.
        return beverage.cost() + .10;
    }
}
