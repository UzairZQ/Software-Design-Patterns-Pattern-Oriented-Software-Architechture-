package ObserverPattern.WeatherStation;

public interface Observer {
    public void updateTemp(double value);
    public void updateWindSpeed(double value);
    public void updatePressure(double value);
}
