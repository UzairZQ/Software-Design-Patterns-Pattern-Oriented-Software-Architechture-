package AdapterPattern.TurkeyDuckAdapter;

/**
 * ADAPTER PATTERN: A Concrete Adaptee (SuperDrone)
 * 
 * This is a specific type of Drone that we want to use as a Duck.
 */
public class SuperDrone implements Drone{

    public void beep(){
        System.out.println("Beep Beep Beep");
    }

    public void spin_rotors(){
        System.out.println("Rotors are spinning");
    }
    
    public void take_off(){
        System.out.println("Taking off booozz");
    }
}
