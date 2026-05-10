package Behavioral.StrategyPattern.Duck;

/**
 * STRATEGY PATTERN: A Concrete Strategy for Flying
 * 
 * This is the standard behavior for ducks that fly with their wings.
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
} 
