package Structural.AdapterPattern.TurkeyDuckAdapter;

/**
 * ADAPTER PATTERN: The Adaptee Interface (Turkey)
 * 
 * Turkeys don't quack, they gobble. This interface is incompatible 
 * with the Duck interface until we use an Adapter.
 */
public interface Turkey {
    public void gobble();
    public void fly();
}
