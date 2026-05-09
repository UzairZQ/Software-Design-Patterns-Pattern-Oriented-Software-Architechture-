package AdapterPattern.TurkeyDuckAdapter;

/**
 * ADAPTER PATTERN: The Target Interface
 * 
 * This is the interface the client expects. 
 * Any class that wants to work in our 'Duck' system must implement this.
 */
public interface Duck {
    public void quack();
    public void fly();
}
