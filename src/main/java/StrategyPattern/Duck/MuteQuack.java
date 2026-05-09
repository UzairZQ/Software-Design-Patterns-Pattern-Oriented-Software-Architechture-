package StrategyPattern.Duck;

/**
 * STRATEGY PATTERN: A Concrete Strategy for Quacking
 * 
 * This strategy is for ducks that don't make any sound at all.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }           
}
