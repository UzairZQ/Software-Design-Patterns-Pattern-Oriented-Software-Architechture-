package Behavioral.StrategyPattern.Duck;

/**
 * STRATEGY PATTERN: A Concrete Strategy for Flying
 * 
 * This shows how easy it is to add NEW behaviors. 
 * We created a rocket-powered flying behavior without touching 
 * any existing duck classes!
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
