package Behavioral.StrategyPattern.Duck;

/**
 * STRATEGY PATTERN: A Concrete Strategy for Flying
 * 
 * This class is used for ducks that simply cannot fly (like rubber ducks).
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }       
}
