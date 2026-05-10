package Structural.AdapterPattern.TurkeyDuckAdapter;

/**
 * ADAPTER PATTERN: The Client
 * 
 * The client is written to work with the Duck interface. 
 * Thanks to the Adapter, we can pass it a Turkey or even a Drone, 
 * and the client won't know the difference!
 */
public class DuckSimulator {
    public static void main(String[] args){
        // 1. We have a real duck
        Duck duck = new MallardDuck();
        System.out.println("The Duck says...");
        testDuck(duck);

        // 2. We have a turkey, but we want to use it where a duck is expected.
        Turkey turkey = new WildTurkey();
        // We wrap the turkey in an adapter that "looks like" a duck.
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
        
        // 3. We can even adapt a Drone!
        Drone myDrone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(myDrone);
        System.out.println("\nThe DroneAdapter says...");
        testDuck(droneAdapter);
    }

    /**
     * This method only knows how to talk to the Duck interface.
     * It doesn't care if the object is a real Duck, an adapted Turkey, 
     * or an adapted Drone.
     */
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
