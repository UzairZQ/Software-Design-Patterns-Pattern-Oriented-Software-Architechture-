package Behavioral.StrategyPattern.Duck;

/**
 * STRATEGY PATTERN: The Strategy Interface for Quacking
 * 
 * Every class that implements this must provide its own 
 * version of the quack() method.
 */
public interface QuackBehavior {
    void quack();
}
