package Behavioral.CommandPattern;

/**
 * COMMAND PATTERN: The Receiver
 * 
 * This is the object that actually knows how to perform 
 * the work (turning the light on/off).
 */
public class Light {
    public void on() {
        System.out.println("The light is ON");
    }

    public void off() {
        System.out.println("The light is OFF");
    }
}
