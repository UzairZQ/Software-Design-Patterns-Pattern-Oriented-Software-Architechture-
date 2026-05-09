package ObserverPattern.WeatherStation;

/**
 * OBSERVER PATTERN: The Subject (or Observable) Interface
 * 
 * This interface defines the contract for any object that wants to be 
 * observed. It provides methods to add, remove, and notify observers.
 */
public interface WeatherStationInterface {
    /**
     * Call this to subscribe an observer.
     */
    public void registerObserver(Observer o);

    /**
     * Call this to unsubscribe an observer.
     */
    public void removeObserver(Observer o);

    /**
     * This method is called to update all current observers 
     * when the subject's state changes.
     */
    public void notifyObservers();
}
