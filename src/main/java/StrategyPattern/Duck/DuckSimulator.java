package StrategyPattern.Duck;

/**
 * STRATEGY PATTERN: The Simulator
 * 
 * This is the main class where we test our ducks.
 * It shows how different ducks can have different behaviors
 * even though they all inherit from the same 'Duck' class.
 */
public class DuckSimulator {
    public static void main(String[] args) {
        // 1. Create a Mallard Duck (it flies and quacks)
        Duck mallard = new MallardDuck();
         mallard.performFly();
         mallard.performQuack();

        // 2. Create a Rubber Duck (it can't fly, it squeaks)
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        // 3. SHOWING RUNTIME FLEXIBILITY:
        // Let's make the rubber duck silent suddenly!
        System.out.println("\nChanging RubberDuck behavior at runtime...");
        rubberDuck.setQuackBehavior(new MuteQuack());
        rubberDuck.performQuack();
    }
}
