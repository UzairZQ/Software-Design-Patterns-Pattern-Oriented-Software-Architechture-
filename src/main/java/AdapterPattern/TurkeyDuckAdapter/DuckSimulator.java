package AdapterPattern.TurkeyDuckAdapter;

public class DuckSimulator {
    public static void main(String[] args){
        //Test a duck
        Duck duck = new MallardDuck();
        testDuck(duck);

        //test a turkey
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
        
        //test a drone
        Drone myDrone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(myDrone);
        testDuck(droneAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
    
}
