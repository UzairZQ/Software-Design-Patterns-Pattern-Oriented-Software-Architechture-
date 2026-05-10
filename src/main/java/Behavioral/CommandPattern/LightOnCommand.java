package Behavioral.CommandPattern;

/**
 * COMMAND PATTERN: A Concrete Command
 * 
 * This class wraps a request (Light On) into an object.
 */
public class LightOnCommand implements Command {
    Light light; // The Receiver

    // The constructor takes the specific receiver it will control
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * The execute method calls the specific action on the receiver.
     */
    @Override
    public void execute() {
        light.on();
    }
}
