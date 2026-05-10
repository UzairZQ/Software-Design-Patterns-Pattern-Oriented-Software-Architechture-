package Behavioral.CommandPattern;

/**
 * COMMAND PATTERN: The Invoker
 * 
 * This is the Remote Control. It doesn't know WHAT it is 
 * controlling; it just knows it has a slot that holds a Command.
 */
public class SimpleRemoteControl {
    Command slot; // Holds one command

    public void setCommand(Command command) {
        this.slot = command;
    }

    /**
     * When the button is pressed, we simply call execute() 
     * on whatever command is currently in the slot.
     */
    public void buttonWasPressed() {
        slot.execute();
    }
}
