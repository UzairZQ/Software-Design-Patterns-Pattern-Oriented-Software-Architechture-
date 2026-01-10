package StrategyPattern;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        // Change behavior at runtime
        rubberDuck.setQuackBehavior(new MuteQuack());
        rubberDuck.performQuack();  
    }   
}
