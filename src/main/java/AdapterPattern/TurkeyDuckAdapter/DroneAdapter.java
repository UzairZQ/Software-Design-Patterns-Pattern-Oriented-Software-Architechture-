package AdapterPattern.TurkeyDuckAdapter;

public class DroneAdapter implements Duck {
Drone drone;
    public DroneAdapter(Drone drone){
        this.drone = drone;
    }
    
    
    public void fly(){
        drone.spin_rotors();
        drone.take_off();
    }

    public void quack(){
        drone.beep();
    }
}
