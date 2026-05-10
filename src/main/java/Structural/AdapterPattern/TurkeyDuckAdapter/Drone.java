package Structural.AdapterPattern.TurkeyDuckAdapter;

/**
 * ADAPTER PATTERN: The Adaptee Interface (Drone)
 * 
 * This is an interface for a Drone. It has different method names 
 * than a Duck (beep vs quack).
 */
public interface Drone {
    public void beep();
    public void spin_rotors();
    public void take_off();
}