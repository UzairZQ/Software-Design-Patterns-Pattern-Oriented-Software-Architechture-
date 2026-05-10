package Behavioral.StrategyPattern.Duck;

/**
 * STRATEGY PATTERN: The Strategy Interface for Flying
 * 
 * Every class that implements this interface must provide its own 
 * version of the fly() method.
 */
public interface FlyBehavior {
     void fly();
}