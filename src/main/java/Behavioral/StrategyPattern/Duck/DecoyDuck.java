package Behavioral.StrategyPattern.Duck;

/**
 * STRATEGY PATTERN: A Concrete Context
 * 
 * This is a specific type of duck that cannot fly and does not quack.
 * By using the Strategy Pattern, we just assign 'FlyNoWay' and 'MuteQuack' 
 * in the constructor. No need to rewrite the logic!
 */
public class DecoyDuck extends Duck {                                                            
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }         

    @Override
    public void display() {
        System.out.println("I'm a Decoy duckie");
    }       
}
