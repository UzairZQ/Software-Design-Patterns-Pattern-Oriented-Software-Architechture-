package ObserverPattern.WeatherStation;

import java.util.ArrayList;

/**
 * OBSERVER PATTERN: The Concrete Subject
 * 
 * This is the object that "knows" things (like temperature). 
 * When its state changes, it notifies all its observers automatically.
 */
public class WeatherStation implements WeatherStationInterface {

    private double temperature;
    private double windSpeed;
    private double pressure;

    // We keep track of all our observers in a list.
    private ArrayList<Observer> observers;

    public WeatherStation(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
        // LOOSE COUPLING: The subject only knows that the observer 
        // implements the 'Observer' interface. It doesn't need to know 
        // if it's a Logger, a UI, or an Alert system.
        
        // Give the newly registered observer the current state immediately
        o.updateTemp(this.temperature);
        o.updateWindSpeed(this.windSpeed);
        o.updatePressure(this.pressure);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    /**
     * The heart of the pattern: loop through all observers and 
     * call their update methods.
     */
    public void notifyObservers(){
        for (Observer observer: observers ){
            observer.updateTemp(this.temperature);
            observer.updateWindSpeed(this.windSpeed);
            observer.updatePressure(this.pressure);
        }
    }

    // Whenever a value is set, we automatically notify our observers!
    public void setTemp(double temp){
        this.temperature = temp;
        notifyObservers();
    }

    public void setWindSpeed(double wind){
        this.windSpeed = wind;
        notifyObservers();
    }

    public void setPressure(double pressure){
        this.pressure = pressure;
        notifyObservers();
    }
}
