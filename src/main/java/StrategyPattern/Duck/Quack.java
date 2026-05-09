package StrategyPattern.Duck;

/**
 * STRATEGY PATTERN: A Concrete Strategy for Quacking
 * 
 * This is the classic quack sound.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }   
}
