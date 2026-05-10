package Behavioral.CommandPattern;

/**
 * COMMAND PATTERN: The Command Interface
 * 
 * All command objects must implement this interface. 
 * It usually only has one method: execute().
 */
public interface Command {
    public void execute();
}
