package Behavioral.StrategyPattern.Duck;

/**
 * STRATEGY PATTERN: A Concrete Context
 * 
 * This is a real duck. In its constructor, we define exactly how 
 * it flies and quacks by picking specific strategy classes.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        // We pick the strategies here
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
