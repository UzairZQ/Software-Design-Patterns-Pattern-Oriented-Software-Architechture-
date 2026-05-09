package StrategyPattern.Duck;

/**
 * STRATEGY PATTERN: A Concrete Context
 * 
 * This is a rubber duck. It can't fly, and it squeaks instead of quacking.
 * We simply plug in the correct behaviors in the constructor.
 */
public class RubberDuck extends Duck {
    
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    
    public void display() {
        System.out.println("I'm a rubber duckie");
    }       
} 
