package Structural.AdapterPattern.TurkeyDuckAdapter;

/**
 * ADAPTER PATTERN: The Adapter (Drone to Duck)
 * 
 * This class lets a Drone act like a Duck. 
 * When someone calls quack(), the drone beeps!
 */
public class DroneAdapter implements Duck {
    Drone drone;

    public DroneAdapter(Drone drone){
        this.drone = drone;
    }
    
    /**
     * Translating 'fly' into drone actions.
     */
    public void fly(){
        drone.spin_rotors();
        drone.take_off();
    }

    /**
     * Translating 'quack' into 'beep'.
     */
    public void quack(){
        drone.beep();
    }
}
