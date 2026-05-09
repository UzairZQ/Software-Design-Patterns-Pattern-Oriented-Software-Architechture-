package ObserverPattern.WeatherStation;

/**
 * OBSERVER PATTERN: A Concrete Observer
 * 
 * This observer watches for "extreme" weather values and prints 
 * an ALERT message if a threshold is crossed.
 */
public class Alert implements Observer {
    private WeatherStationInterface weatherStation;
    private double tempThreshold = 35.0;
    private double windThreshold = 20.0;
    private double pressureThreshold = 980.0;

    public Alert(WeatherStationInterface weatherStation){
        this.weatherStation = weatherStation;
        // The observer registers ITSELF with the subject in its constructor.
        weatherStation.registerObserver(this);
    }

    public void alert(String message){
        System.out.println("ALERT: " + message);
    }

    @Override
    public void updateTemp(double value){
        if (value >= tempThreshold){
            alert("High temperature: " + value);
        }
    }

    @Override
    public void updateWindSpeed(double value){
        if (value >= windThreshold){
            alert("High wind speed: " + value);
        }
    }

    @Override
    public void updatePressure(double value){
        if (value <= pressureThreshold){
            alert("Low pressure: " + value);
        }
    }
}
