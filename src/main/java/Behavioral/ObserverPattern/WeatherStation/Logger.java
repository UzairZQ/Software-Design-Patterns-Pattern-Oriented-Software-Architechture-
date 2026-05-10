package Behavioral.ObserverPattern.WeatherStation;

/**
 * OBSERVER PATTERN: A Concrete Observer
 * 
 * This observer simply logs every update it receives to the console.
 */
public class Logger implements Observer {
    public Logger(WeatherStationInterface weatherStation){
        // Registering with the subject
        weatherStation.registerObserver(this);
    }

    public void log(String message){
        System.out.println("LOG: " + message);
    }

    @Override
    public void updateTemp(double value){
        log("Temperature updated to " + value);
    }

    @Override
    public void updateWindSpeed(double value){
        log("Wind speed updated to " + value);
    }

    @Override
    public void updatePressure(double value){
        log("Pressure updated to " + value);
    }
}
