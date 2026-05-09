package ObserverPattern.GeneralExample;

/**
 * OBSERVER PATTERN: The Subject Interface
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
