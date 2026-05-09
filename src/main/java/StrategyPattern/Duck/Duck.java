package StrategyPattern.Duck;

/**
 * STRATEGY PATTERN: The Context Class
 * 
 * This is the base class for all ducks. Instead of implementing behaviors (like flying)
 * directly in this class, we separate them into different classes.
 * 
 * Design Principle: "Identify the aspects of your application that vary 
 * and separate them from what stays the same."
 */
public abstract class Duck {
    
    // STRATEGY PATTERN: "Favor composition over inheritance"
    // Instead of inheriting fly() or quack(), the Duck HAS-A behavior object.
    // These are interfaces, NOT concrete classes, so we can swap them easily.
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {
        // Default behaviors (optional, can be overridden by subclasses)
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    /**
     * Runtime Flexibility:
     * This method lets us change the duck's flying behavior while the program is running!
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    /**
     * DELEGATION:
     * The Duck doesn't know HOW to fly; it just asks the flyBehavior object to do it.
     */
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();
}