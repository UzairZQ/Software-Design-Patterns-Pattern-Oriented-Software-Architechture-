package StrategyPattern.Duck;

/**
 * STRATEGY PATTERN: A Concrete Strategy for Quacking
 * 
 * This behavior is used for rubber ducks that squeak.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }   
}
