package ObserverPattern.WeatherStation;

/**
 * OBSERVER PATTERN: The Observer Interface
 * 
 * Any class that wants to receive updates from the Subject must 
 * implement this interface. It defines how the subject will 
 * "push" data to the observer.
 */
public interface Observer {
    /**
     * These methods are called by the Subject when new data is available.
     */
    public void updateTemp(double value);
    public void updateWindSpeed(double value);
    public void updatePressure(double value);
}
